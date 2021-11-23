@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((requestCode == (MyGlobalVars.REQUEST_IMAGE_CAPTURE)) && (resultCode == (RESULT_OK))) {
        android.os.Bundle extras = data.getExtras();
        android.graphics.Bitmap imageBitmap = ((android.graphics.Bitmap) (extras.get("data")));
        addImageToView(imageBitmap);
    }
}