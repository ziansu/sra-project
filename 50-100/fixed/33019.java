public final void changeBlurMode(com.stefanosiano.powerfulimageview.blur.PivBlurMode blurMode, int radius) {
    switch (blurMode) {
        case DISABLED :
            if ((mGaussianFastBlurAlgorithm) == null)
                mGaussianFastBlurAlgorithm = new com.stefanosiano.powerfulimageview.blur.algorithms.GaussianFastBlurAlgorithm();
            
            mBlurAlgorithm = mGaussianFastBlurAlgorithm;
            break;
    }
    mLastRadius = -1;
    this.mRadius = radius;
}