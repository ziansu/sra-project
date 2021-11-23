@java.lang.Override
public final org.takes.Response exit(final org.takes.Response response, final org.takes.facets.auth.Identity identity) throws java.io.IOException {
    try {
        return this.all.get(this.index).exit(response, identity);
    } catch (final java.lang.IndexOutOfBoundsException exc) {
        throw new java.io.IOException("Index of identity is greater than Pass collection size", exc);
    }
}