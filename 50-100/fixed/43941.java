private void startCamera() {
    android.content.Intent cameraIntent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    if ((cameraIntent.resolveActivity(getPackageManager())) != null) {
        java.io.File cameraFile = com.ln.images.models.FileUtils.createCameraFile(this);
        cameraPath = cameraFile.getAbsolutePath();
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, android.net.Uri.fromFile(cameraFile));
        startActivityForResult(cameraIntent, com.ln.images.activities.ImagesCheckActivity.REQUEST_CAMERA);
    }
}