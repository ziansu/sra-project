public io.ddf.DDF getDDFByUri(java.lang.String uri) throws io.ddf.exception.DDFException {
    java.util.UUID uuid = this.mUris.get(uri);
    if (uuid == null) {
        throw new io.ddf.exception.DDFException(java.lang.String.format("Cannot find ddf with uri %s", uri));
    }
    return this.getDDF(uuid);
}