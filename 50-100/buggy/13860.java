private java.lang.String parseForResult(java.lang.String response) {
    java.lang.String result = response.substring(response.indexOf("<pre>"), response.indexOf("</pre>"));
    result = result.substring(((result.lastIndexOf('/')) + 1), result.length());
    result = result.trim();
    return result.replace("<f>", "").trim();
}