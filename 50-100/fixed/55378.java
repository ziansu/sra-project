private java.lang.String makeDirs(java.lang.String packName) {
    java.lang.String path = (packName.replace('.', '/')) + '/';
    java.io.File dir = new java.io.File(dirRoot, path);
    if ((!(dir.exists())) && (dir.mkdirs())) {
        java.io.File packDir = new java.io.File(dirRoot, path);
        log(("mkdir -> " + (packDir.getAbsolutePath())));
        return path;
    }
    return path;
}