public java.lang.String getContextPath() {
    java.lang.String uri = this.fullHttpRequest.uri();
    int slashIndex = uri.indexOf("/", 1);
    int queIndex = uri.indexOf("?", 0);
    if ((slashIndex > queIndex) && (queIndex != (-1))) {
        slashIndex = -1;
    }
    return uri.substring(0, (slashIndex == (-1) ? queIndex == (-1) ? uri.length() : queIndex : slashIndex));
}