public com.yalantis.ucrop.UCrop withMaxResultSize(@android.support.annotation.IntRange(from = 100)
int width, @android.support.annotation.IntRange(from = 100)
int height) {
    mCropOptionsBundle.putBoolean(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_SET, true);
    mCropOptionsBundle.putInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_X, width);
    mCropOptionsBundle.putInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_Y, height);
    return this;
}