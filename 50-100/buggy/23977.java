public com.soundcloud.android.crop.Crop useCustomLayout(final int layoutResId, final int cropImageId, final int btnDoneId, final int btnCancelId) {
    cropIntent.putExtra(com.soundcloud.android.crop.Crop.Extra.LAYOUT_ID, layoutResId);
    cropIntent.putExtra(com.soundcloud.android.crop.Crop.Extra.LAYOUT_ID_CROP_IMAGE, cropImageId);
    cropIntent.putExtra(com.soundcloud.android.crop.Crop.Extra.LAYOUT_ID_BTN_DONE, btnDoneId);
    cropIntent.putExtra(com.soundcloud.android.crop.Crop.Extra.LAYOUT_ID_BTN_CANCEL, btnCancelId);
    return this;
}