private void handleCameraPhoto() {
    if ((mCurrentPhotoPath) != null) {
        setPicture();
        galleryAddPic();
        mCurrentPhotoPath = null;
    }
}