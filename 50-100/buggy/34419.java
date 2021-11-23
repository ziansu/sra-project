private void receiveArcadePhoto() {
    if (((photoFile) != null) || (photoFile.exists())) {
        android.graphics.Bitmap bitmap = getScaledBitmap(photoFile.getPath(), this);
        currentImage = bitmap;
        cameraButton.setImageBitmap(currentImage);
    }
}