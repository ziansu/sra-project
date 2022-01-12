@java.lang.Override
protected java.net.URI rewriteURI(javax.servlet.http.HttpServletRequest request) {
    java.lang.String query = request.getQueryString();
    if ((this.url) == null) {
        return getEntityFromServer(query);
    }
    return query != null ? java.net.URI.create((((this.url) + "?") + query)) : java.net.URI.create(this.url);
}