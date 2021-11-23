void addAffectedPaths(java.lang.Iterable<java.lang.String> paths) {
    for (java.lang.String path : paths) {
        affectedPaths.apply(path);
    }
}