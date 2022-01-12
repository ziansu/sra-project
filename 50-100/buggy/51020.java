public com.xiongyingqi.http.HttpBuilder param(java.lang.String name, java.lang.String value, boolean urlEncoding) {
    java.lang.String encodedValue = null;
    if (urlEncoding) {
        try {
            encodedValue = java.net.URLEncoder.encode(value, charset.name());
        } catch (java.io.UnsupportedEncodingException e) {
            com.xiongyingqi.Logger.error(e);
        }
    }
    if (encodedValue == null) {
        encodedValue = value;
    }
    org.apache.http.NameValuePair nameValuePair = new org.apache.http.message.BasicNameValuePair(name, encodedValue);
    this.nameValuePairs.add(nameValuePair);
    return this;
}