private static java.lang.String handleUrl(java.lang.String url) {
    return url.substring(((url.lastIndexOf("/")) + 1), url.indexOf(".json"));
}