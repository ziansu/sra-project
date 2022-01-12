@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (((requestCode == (com.jaychang.widget.spp.CameraHiddenActivity.RC_CAMERA)) && (resultCode == (RESULT_OK))) && ((photoUri) != null)) {
        com.jaychang.widget.spp.SimplePhotoPicker.getInstance().onPhotoPicked(photoUri);
    }
    finish();
}