public void withAspectRatio(float x, float y) {
    mOptionBundle.putBoolean(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_SET, true);
    mOptionBundle.putFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_X, x);
    mOptionBundle.putFloat(com.yalantis.ucrop.UCrop.EXTRA_ASPECT_RATIO_Y, y);
}