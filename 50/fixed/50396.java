private boolean isImageSizeRatioValid(float imageSizeRatio) {
    return (imageSizeRatio >= (mMinimumRatio)) && (imageSizeRatio <= (mMaximumRatio));
}