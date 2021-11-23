public void cameraVIntent() {
    android.content.Intent videoIntent = new android.content.Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
    startActivityForResult(videoIntent, CAMERA_VIDEO_CAPTURE);
}