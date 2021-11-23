public com.mashape.unirest.request.body.MultipartBody field(java.lang.String name, java.util.Collection<?> collection) {
    for (java.lang.Object current : collection) {
        boolean isFile = current instanceof java.io.File;
        field(name, current, isFile, null, null);
    }
    return this;
}