@java.lang.Override
public java.lang.String[] list(java.lang.String path) throws java.io.IOException {
    path = alluxio.util.io.PathUtils.normalizePath(path, alluxio.underfs.swift.SwiftUnderFileSystem.PATH_SEPARATOR);
    return listInternal(path);
}