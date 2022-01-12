private java.lang.String writeBody(android.content.ContentValues values) {
    java.lang.StringBuilder bodyBuilder = new java.lang.StringBuilder();
    if (values != null) {
        for (java.lang.String key : values.keySet()) {
            if ((bodyBuilder.length()) != 0) {
                bodyBuilder.append('&');
            }
            bodyBuilder.append(key).append('=').append(values.getAsString(key));
        }
    }
    return bodyBuilder.toString();
}