@java.lang.Override
public int getCurrentFocus() {
    if (autoFocus) {
        return -1;
    }
    try {
        java.lang.String focusRes = sendRequest(buildPanTiltHeadControlURL("%23GF"));
        if (focusRes.startsWith("gf")) {
            int focus = java.lang.Integer.parseInt(focusRes.substring(2), 16);
            return focus;
        }
        throw new java.io.IOException(((errorString) + focusRes));
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return lastKnown.getFocus();
    }
}