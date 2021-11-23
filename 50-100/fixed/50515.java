@java.lang.Override
protected int readValue() {
    int ret = -1;
    java.lang.String str = readFromInterface();
    if (str != null) {
        if (str.endsWith(" mV")) {
            ret = java.lang.Integer.parseInt(str.substring(0, ((str.length()) - 3)));
        }else {
            ret = java.lang.Integer.parseInt(str);
        }
    }
    return ret;
}