private void displayPhotoActivity() {
    android.content.Intent intent = new android.content.Intent(this, com.babybox.activity.SelectImageActivity.class);
    intent.putExtra(ViewUtil.BUNDLE_KEY_IMAGE_SOURCE, 2);
    intent.putExtra(ViewUtil.BUNDLE_KEY_ID, getIntent().getLongExtra(ViewUtil.BUNDLE_KEY_ID, (-1L)));
    intent.putExtra(ViewUtil.BUNDLE_KEY_INDEX, photos.size());
    intent.setData(selectedImageUri);
    startActivityForResult(intent, ViewUtil.CROP_IMAGE_REQUEST_CODE);
    overridePendingTransition(0, 0);
}