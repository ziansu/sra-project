@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode == (RESULT_OK)) {
        switch (requestCode) {
            case com.lucianoleitefabris.inventoryapp.ProductDetailsActivity.REQUEST_TAKE_PHOTO :
                loadImageFromStorage(mCurrentPhotoPath, mImageView);
                break;
            case com.lucianoleitefabris.inventoryapp.ProductDetailsActivity.GALLERY_REQUEST :
                loadImageFromGallery(data);
                break;
            default :
                throw new java.lang.IllegalArgumentException("No such request available");
        }
    }
    super.onActivityResult(requestCode, resultCode, data);
}