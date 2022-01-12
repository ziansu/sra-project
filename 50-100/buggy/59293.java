@java.lang.Override
public void onImageItemInteraction(com.zfdang.multiple_images_selector.models.ImageItem item) {
    if (com.zfdang.multiple_images_selector.models.ImageListContent.bReachMaxNumber) {
        java.lang.String hint = java.lang.String.format(getResources().getString(R.string.selector_reach_max_image_hint), SelectorSettings.mMaxImageNumber);
        android.widget.Toast.makeText(this, hint, Toast.LENGTH_SHORT).show();
        com.zfdang.multiple_images_selector.models.ImageListContent.bReachMaxNumber = false;
    }
    if (item.isCamera()) {
        launchCamera();
    }
    updateDoneButton();
}