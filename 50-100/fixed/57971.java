public com.ibm.maximo.oslc.ResourceSet resourceSet(java.net.URL url) throws com.ibm.maximo.oslc.OslcException, java.io.IOException {
    java.lang.String[] strs = url.getPath().split("/");
    java.lang.String osName = null;
    for (int i = 0; i < (strs.length); i++) {
        if (strs[i].equals("os")) {
            osName = strs[(i + 1)];
            break;
        }
    }
    return new com.ibm.maximo.oslc.ResourceSet(osName, this);
}