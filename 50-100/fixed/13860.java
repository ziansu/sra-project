private java.lang.String parseForResult(java.lang.String response) {
    if (!(response.contains("<pre>"))) {
        return null;
    }
    java.lang.String result = response.substring(response.indexOf("<pre>"), response.indexOf("</pre>"));
    result = result.substring(((result.lastIndexOf('/')) + 1), result.length());
    result = result.trim();
    return result.replace("<f>", "").trim();
}