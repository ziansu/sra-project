private void setClearPhotosButtonText() {
    java.lang.String buttonText = getString(R.string.image_selection_clear_photos_format_string, mUncheckedImagesCount, getResources().getQuantityString(R.plurals.Photo_plurals, mUncheckedImagesCount));
    mClearPhotosButton.setText(buttonText);
}