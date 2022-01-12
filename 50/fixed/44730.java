public final boolean show(java.lang.String viewname) {
    this.set("path", this.path);
    this.set("query", this.query);
    return show(viewname, false);
}