private void setDotRevealFraction(int dot, float fraction) {
    dotRevealFractions[dot] = fraction;
    android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
}