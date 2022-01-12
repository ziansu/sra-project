@java.lang.Override
protected alluxio.underfs.gcs.ObjectListingChunk getObjectListingChunk(java.lang.String key, boolean recursive) throws java.io.IOException {
    key = alluxio.util.io.PathUtils.normalizePath(key, alluxio.underfs.gcs.PATH_SEPARATOR);
    java.lang.String delimiter = (recursive) ? "" : PATH_SEPARATOR;
    org.jets3t.service.StorageObjectsChunk chunk = getObjectListingChunk(key, delimiter, null);
    if (chunk != null) {
        return new alluxio.underfs.gcs.GCSUnderFileSystem.GCSObjectListingChunk(chunk);
    }
    return null;
}