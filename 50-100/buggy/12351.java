@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent imageReturnedIntent) {
    super.onActivityResult(requestCode, resultCode, imageReturnedIntent);
    switch (requestCode) {
        case SELECT_PHOTO :
            if (resultCode == (RESULT_OK)) {
                final android.net.Uri imageUri = imageReturnedIntent.getData();
                mImageFilePath = com.amansoni.tripbook.util.ImageWrapper.getRealPathFromURI(this, imageUri);
                com.amansoni.tripbook.util.ImageWrapper.loadImageFromFile(this, mMainImage, mImageFilePath, 400);
                mTripbookItem.setThumbnail(mImageFilePath);
            }
    }
}