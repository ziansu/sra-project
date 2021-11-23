private void setJoiningFraction(int leftDot, float fraction) {
    if (leftDot < (joiningFractions.length)) {
        joiningFractions[leftDot] = fraction;
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
            postInvalidateOnAnimation();
        }else {
            postInvalidate();
        }
    }
}