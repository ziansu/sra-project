private void setClearPhotosButtonText() {
    java.lang.String buttonText = getString(R.string.image_selection_clear_photos_format_string, getResources().getQuantityString(R.plurals.Photo_plurals, mUncheckedImagesCount, mUncheckedImagesCount));
    mClearPhotosButton.setText(buttonText);
}