@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent resultData) {
    if ((requestCode == (com.example.android.storeinventory.EditorActivity.PICK_IMAGE_REQUEST)) && (resultCode == (android.app.Activity.RESULT_OK))) {
        if (resultData != null) {
            android.net.Uri mImageUri;
            mImageUri = resultData.getData();
            android.util.Log.i(com.example.android.storeinventory.EditorActivity.LOG_TAG, ("Uri: " + (mImageUri.toString())));
            mImageImageView.setImageBitmap(getBitmapFromUri(mImageUri));
        }
    }
}