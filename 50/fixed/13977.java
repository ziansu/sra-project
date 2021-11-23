private boolean isInside(java.lang.String path, java.lang.String folder) {
    return (path == null) || ("".equals(path)) ? false : path.startsWith(folder);
}