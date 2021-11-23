public java.util.function.Function<org.apache.http.HttpResponse, java.lang.Object> parser(final java.lang.String contentType) {
    java.util.function.Function<org.apache.http.HttpResponse, java.lang.Object> p = this.parser(contentType);
    if (p != null) {
        return p;
    }
    if ((getParent()) != null) {
        return getParent().getResponse().getEffective().parser(contentType);
    }
}