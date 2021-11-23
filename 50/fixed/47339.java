public final void stopAnimation() {
    if ((mAnimation) != null) {
        mAnimation.end();
        mAnimation = null;
    }
}