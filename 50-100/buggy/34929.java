public void declinePhoto(android.view.View view) {
    android.widget.ImageButton imgIcon = ((android.widget.ImageButton) (findViewById(R.id.capture)));
    imgIcon.setEnabled(true);
    if (hasFlash()) {
        android.widget.ImageButton flash = ((android.widget.ImageButton) (findViewById(R.id.flash)));
        flash.setVisibility(View.VISIBLE);
    }
    android.hardware.Camera.Parameters params = customCamera.getParameters();
    if (hasFlash()) {
        params.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
    }
    customCamera.setParameters(params);
    photoTaken = null;
    displayPicture();
}