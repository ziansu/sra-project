public float scale(com.amosyuen.videorecorder.video.ImageSize targetSize, com.amosyuen.videorecorder.video.ImageSize.ScaleType scaleType, boolean allowUpscale) {
    switch (scaleType) {
        case FILL :
            return scaleToFill(targetSize, allowUpscale);
        case FIT :
            return scaleToFit(targetSize, allowUpscale);
    }
    return 1.0F;
}