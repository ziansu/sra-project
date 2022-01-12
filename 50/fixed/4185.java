public void add(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    fileUri = getOutputMediaFileUri();
    intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
    startActivityForResult(intent, com.example.arjun.nhacks.GroupHardActivity.CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
}