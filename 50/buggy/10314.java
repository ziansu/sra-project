public com.yalantis.ucrop.UCrop useSourceImageAspectRatio() {
    mCropOptionsBundle.putBoolean(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_SET, true);
    mCropOptionsBundle.putFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_X, 0);
    mCropOptionsBundle.putFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_Y, 0);
    return this;
}