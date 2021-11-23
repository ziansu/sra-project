protected int getMaxLines() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
        return 8;
    }
    return 6;
}