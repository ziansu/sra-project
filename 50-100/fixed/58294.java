pl.sutkowski.api.FileLocationHolder resolveAbsolutePath(pl.sutkowski.api.FileLocationHolder url) {
    if (url == null) {
        throw pl.sutkowski.api.exception.FileStorageException.pathNotFound();
    }
    if ((url.getPath().startsWith("\\")) || (url.getPath().startsWith("/"))) {
        return new pl.sutkowski.api.impl.PathFileLocationHolder(baseDirectory.resolve(url.getPath().toString().substring(1)));
    }
    return new pl.sutkowski.api.impl.PathFileLocationHolder(baseDirectory.resolve(url.getPath()));
}