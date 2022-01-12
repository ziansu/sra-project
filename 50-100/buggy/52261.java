public static java.io.InputStream getNetInputStream(java.lang.String url) throws java.io.IOException {
    if ((org.evergreen_ils.globals.Utils.mConn) != null)
        org.evergreen_ils.globals.Utils.mConn.disconnect();
    
    try {
        java.net.URL url2 = new java.net.URL(url);
        org.evergreen_ils.globals.Utils.mConn = ((java.net.HttpURLConnection) (url2.openConnection()));
        return org.evergreen_ils.globals.Utils.mConn.getInputStream();
    } catch (java.lang.Exception e) {
        org.evergreen_ils.globals.Log.d(org.evergreen_ils.globals.Utils.TAG, ("Exception fetching " + url), e);
    }
    return null;
}