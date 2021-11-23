@java.lang.Override
protected org.craftercms.core.store.impl.File getFile(org.craftercms.core.service.Context context, java.lang.String path) throws org.craftercms.core.exception.PathNotFoundException {
    org.craftercms.core.store.impl.File file = findFile(context, path);
    if (file == null) {
        throw new org.craftercms.core.exception.PathNotFoundException((("File " + file) + " can't be found"));
    }
    return file;
}