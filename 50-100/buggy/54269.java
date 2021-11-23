@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent resultData) {
    if ((requestCode == (com.acelerem.android.inventory.EditorActivity.PICK_IMAGE_REQUEST)) && (resultCode == (RESULT_OK))) {
        if (resultData != null) {
            mUri = resultData.getData();
            android.util.Log.i(com.acelerem.android.inventory.EditorActivity.LOG_TAG, ("Uri: " + (mUri.toString())));
            mImageView.setImageBitmap(getBitmapFromUri(mUri));
        }
    }
}