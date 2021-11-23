protected java.io.File getCorrespondingRoot(java.io.File file) {
    if (org.waarp.common.file.AbstractDir.ISUNIX) {
        return new java.io.File("/");
    }
    java.lang.String path = file.getAbsolutePath();
    for (java.io.File root : org.waarp.common.file.AbstractDir.roots) {
        if (path.startsWith(root.getAbsolutePath())) {
            return root;
        }
    }
    org.waarp.common.file.AbstractDir.logger.warn(("No root found for " + (file.getAbsolutePath())));
    return org.waarp.common.file.AbstractDir.roots[0];
}