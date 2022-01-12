private void handleTakePictureResult(int resultCode, android.content.Intent resultIntent) {
    if (resultCode == (RESULT_OK)) {
        android.widget.ImageView imgView = ((android.widget.ImageView) (findViewById(R.id.imgShowImage)));
        mPhotoPathName = mPhotoPathUri.getPath();
        com.example.a454203.aone_sample.PhotoHelper.addPhotoToMediaStoreAndDisplayThumbnail(mPhotoPathName, this, imgView);
    }else {
        mPhotoPathUri = null;
        mPhotoPathName = null;
        android.widget.Toast.makeText(this, "User cancelled", Toast.LENGTH_LONG).show();
    }
}