private void setDotRevealFraction(int dot, float fraction) {
    if (dot < (dotRevealFractions.length)) {
        dotRevealFractions[dot] = fraction;
    }
    android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
}