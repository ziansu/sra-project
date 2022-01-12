@java.lang.Override
public java.util.stream.Stream<java.nio.file.Path> loadAll() {
    try {
        return java.nio.file.Files.walk(this.rootLocation, 1).filter(( path) -> !(path.equals(this.rootLocation))).map(this.rootLocation::relativize);
    } catch (java.io.IOException e) {
        throw new net.freifunk.videoodyssee.storage.StorageException("Failed to read stored files", e);
    }
}