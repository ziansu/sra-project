@java.lang.Override
public com.upplication.s3fs.S3FileSystem getFileSystem(java.net.URI uri) {
    validateUri(uri);
    java.lang.String key = this.getFileSystemKey(uri);
    if (com.upplication.s3fs.S3FileSystemProvider.fileSystems.containsKey(key)) {
        return com.upplication.s3fs.S3FileSystemProvider.fileSystems.get(key);
    }else {
        throw new java.nio.file.FileSystemNotFoundException(java.lang.String.format("S3 filesystem not yet created. Use newFileSystem() instead"));
    }
}