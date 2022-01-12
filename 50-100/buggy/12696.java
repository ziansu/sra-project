@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if ((requestCode == (rray.me.androidresume.BasicInfoEditActivity.REQ_CODE_PICK_IMAGE)) && (requestCode == (android.app.Activity.RESULT_OK))) {
        android.net.Uri imageUri = data.getData();
        if (imageUri != null) {
            showImage(imageUri);
        }
    }
}