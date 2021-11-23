@java.lang.Override
public final org.takes.Response exit(final org.takes.Response response, final org.takes.facets.auth.Identity identity) throws java.io.IOException {
    if ((this.index) < (this.all.size())) {
        return this.all.get(this.index).exit(response, identity);
    }else {
        throw new java.io.IOException("Index of identity is greater than Pass collection size");
    }
}