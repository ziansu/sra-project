private void updatePhotoView() {
    if (((mPhotoFile) == null) || (!(mPhotoFile.exists()))) {
        mPhotoView.setImageDrawable(null);
        mPhotoView.setClickable(false);
    }else {
        android.graphics.Bitmap bitmap = com.example.android.criminalintent2.PictureUtils.getScaledBitmap(mPhotoFile.getPath(), mPhotoViewSize.x, mPhotoViewSize.y);
        mPhotoView.setImageBitmap(bitmap);
    }
}