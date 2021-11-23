public boolean setVerticalStride() {
    boolean setOk = false;
    try {
        int newStride = java.lang.Integer.valueOf(vrtStr.getText().trim());
        if (newStride >= 1) {
            verticalStride = newStride;
            setOk = true;
        }else {
            setOk = false;
        }
    } catch (java.lang.NumberFormatException nfe) {
    }
    return setOk;
}