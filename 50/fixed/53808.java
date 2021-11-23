@java.lang.Override
public double getAltitude() {
    java.lang.String res;
    try {
        res = requestAndWaitForResponse("ALTI");
    } catch (java.io.IOException e) {
        return -1;
    }
    return res == null ? -1 : java.lang.Double.valueOf(res);
}