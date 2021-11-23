public com.yalantis.ucrop.UCrop withAspectRatio(float x, float y) {
    mCropOptionsBundle.putFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_X, x);
    mCropOptionsBundle.putFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_Y, y);
    return this;
}