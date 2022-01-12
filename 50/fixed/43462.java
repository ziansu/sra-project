public java.net.URL toUrl() {
    try {
        return new java.net.URL(toString());
    } catch (java.net.MalformedURLException e) {
        throw new java.lang.IllegalArgumentException(e);
    }
}