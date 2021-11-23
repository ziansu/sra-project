public boolean setThumbnailBitmap(android.graphics.Bitmap thumbnail) {
    mIconView.setImageBitmap(thumbnail);
    if (super.isChecked()) {
        mIconView.getLayoutParams().height = imageSizeWithBorders();
        mIconView.getLayoutParams().width = imageSizeWithBorders();
        com.example.finnur.finnursphotopicker.PickerBitmapView.addPaddingToParent(mIconView, mBorder);
    }
    boolean noImageWasLoaded = !(mImageLoaded);
    mImageLoaded = true;
    updateSelectionState();
    return noImageWasLoaded;
}