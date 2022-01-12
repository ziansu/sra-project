public org.lightcouch.View descending(java.lang.Boolean descending) {
    this.descending = descending;
    uriBuilder.query("descending", this.descending);
    return this;
}