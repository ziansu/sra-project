public boolean setVerticalStride() {
    boolean setOk = false;
    try {
        int newStride = java.lang.Integer.valueOf(vrtStr.getText().trim());
        verticalStride = newStride;
        setOk = true;
    } catch (java.lang.NumberFormatException nfe) {
    }
    return setOk;
}