protected boolean containsResource(java.lang.String uri) {
    int index = uri.lastIndexOf(".");
    return (index != (-1)) && ((uri.substring(index).length()) > 1);
}