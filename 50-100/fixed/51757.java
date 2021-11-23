private static void writeDataToFile(java.lang.String suffix, java.lang.String data) {
    if ((Constants.DEBUG) && (data != null)) {
        org.apache.http.util.ByteArrayBuffer bab = new org.apache.http.util.ByteArrayBuffer(data.length());
        try {
            bab.append(data.getBytes("UTF-8"), 0, data.length());
            com.sonyericsson.android.drm.drmlicenseservice.DLSHttpClient.writeDataToFile(suffix, bab);
        } catch (java.io.UnsupportedEncodingException e) {
            com.sonyericsson.android.drm.drmlicenseservice.DrmLog.logException(e);
        }
    }
}