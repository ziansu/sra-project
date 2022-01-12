public synchronized void setDDFName(io.ddf.DDF ddf, java.lang.String name) throws io.ddf.exception.DDFException {
    if (!(com.google.common.base.Strings.isNullOrEmpty(name))) {
        ddf.setName(name);
        this.mUris.put(ddf.getUri(), ddf.getUUID());
    }else {
        throw new io.ddf.exception.DDFException(java.lang.String.format("DDF's name cannot be null or empty"));
    }
}