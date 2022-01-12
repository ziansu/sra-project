private void setOkTextNumber() {
    if (((mImages) != null) && (mNeedEdit)) {
        int selectedSize = mSelectedImages.size();
        int size = java.lang.Math.max(mSelectedImages.size(), mMaxCount);
        mOkBtn.setText(getString(R.string.boxing_image_preview_ok_fmt, java.lang.String.valueOf(selectedSize), java.lang.String.valueOf(size)));
        mOkBtn.setEnabled((selectedSize > 0));
    }
}