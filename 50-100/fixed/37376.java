@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera);
    java.lang.System.out.println("starting intent!");
    android.content.Intent intent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    fileUri = blue.jimma.CameraActivity.getOutputMediaFileUri(blue.jimma.CameraActivity.MEDIA_TYPE_IMAGE);
    url = fileUri;
    intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
    startActivityForResult(intent, blue.jimma.CameraActivity.CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
}