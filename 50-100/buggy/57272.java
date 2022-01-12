protected java.lang.String encodeCookie(net.jejer.hipda.okhttp.SerializableCookie cookie) {
    if (cookie == null)
        return null;
    
    java.io.ByteArrayOutputStream os = new java.io.ByteArrayOutputStream();
    try {
        java.io.ObjectOutputStream outputStream = new java.io.ObjectOutputStream(os);
        outputStream.writeObject(cookie);
    } catch (java.io.IOException e) {
        android.util.Log.d(net.jejer.hipda.okhttp.PersistentCookieStore.LOG_TAG, "IOException in encodeCookie", e);
        return null;
    }
    return byteArrayToHexString(os.toByteArray());
}