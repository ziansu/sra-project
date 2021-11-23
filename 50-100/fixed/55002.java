private static java.io.File searchFile(java.lang.String path, java.io.File basedir) {
    java.io.File f = new java.io.File(path);
    if (f.exists())
        return f;
    
    f = new java.io.File(basedir, path);
    if (f.exists()) {
        return f;
    }
    f = new java.io.File(sh.tak.appbundler.CreateApplicationBundleMojo.TARGET_CLASS_ROOT, path);
    if (f.exists()) {
        return f;
    }
    return null;
}