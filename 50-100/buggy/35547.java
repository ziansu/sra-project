private void setJoiningFraction(int leftDot, float fraction) {
    if (leftDot < (joiningFractions.length)) {
        if (leftDot == 1) {
            android.util.Log.d("PageIndicator", ("dot 1 fraction:\t" + fraction));
        }
        joiningFractions[leftDot] = fraction;
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
            postInvalidateOnAnimation();
        }else {
            postInvalidate();
        }
    }
}