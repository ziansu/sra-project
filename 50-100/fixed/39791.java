public void addParameter(java.lang.String name, java.lang.CharSequence text) throws java.io.IOException {
    addSeparator();
    try {
        mBuilder.append(java.net.URLEncoder.encode(name, mCharset));
        mBuilder.append("=");
        if ((text != null) && ((text.length()) > 0)) {
            mBuilder.append(java.net.URLEncoder.encode(text.toString(), mCharset));
        }
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
}