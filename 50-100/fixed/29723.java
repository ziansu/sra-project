@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (resultCode == (android.app.Activity.RESULT_OK)) {
        if (requestCode == (SELECT_FILE)) {
            onSelectFromGalleryResult(data);
        }else
            if (requestCode == (REQUEST_CAMERA)) {
                onCaptureImageResult();
            }
        
    }else {
        mProgressDialog.dismiss();
    }
}