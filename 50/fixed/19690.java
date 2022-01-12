private void uriAppender(java.lang.StringBuilder path) {
    if ((path.indexOf("?")) == (-1)) {
        path.append("?");
    }else {
        path.append("&");
    }
}