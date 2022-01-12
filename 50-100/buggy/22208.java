private boolean needScrollingAnimation() {
    if ((error) != null) {
        float screenWidth = (getWidth()) - (rightLeftSpinnerPadding);
        float errorTextWidth = textPaint.measureText(error.toString(), 0, error.length());
        return errorTextWidth > screenWidth ? true : false;
    }
    return false;
}