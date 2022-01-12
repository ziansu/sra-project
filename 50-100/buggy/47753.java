private void updateImagePreview() {
    if ((mUploadFileUri) != null) {
        com.squareup.picasso.Picasso.with(getContext()).load(mUploadFileUri).into(mPicturePreview);
        mPicturePreview.setVisibility(View.VISIBLE);
        mRemovePictureBt.setVisibility(View.VISIBLE);
    }else {
        mPicturePreview.setVisibility(View.GONE);
        mRemovePictureBt.setVisibility(View.GONE);
    }
}