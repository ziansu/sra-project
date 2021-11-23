public org.lightcouch.View descending(java.lang.Boolean descending) {
    this.descending = java.lang.Boolean.valueOf(gson.toJson(descending));
    uriBuilder.query("descending", this.descending);
    return this;
}