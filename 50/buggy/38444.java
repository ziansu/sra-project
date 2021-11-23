public java.lang.String getName() {
    try {
        mName = new java.lang.String(mName.getBytes("ISO-8859-1"), "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
    }
    return mName;
}