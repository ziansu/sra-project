public static boolean isEncoded(java.lang.String content, java.lang.String charset) {
    if (android.text.TextUtils.isEmpty(content)) {
        return false;
    }
    java.lang.String decodedContent = null;
    try {
        decodedContent = java.net.URLDecoder.decode(content, charset);
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    if ((decodedContent != null) && (decodedContent.equalsIgnoreCase(content))) {
        return false;
    }
    return true;
}