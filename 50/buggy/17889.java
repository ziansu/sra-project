public void cameraVIntent() {
    android.content.Intent videoIntent = new android.content.Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
    videoIntent.putExtra(MediaStore.EXTRA_DURATION_LIMIT, 10);
    startActivityForResult(videoIntent, CAMERA_VIDEO_CAPTURE);
}