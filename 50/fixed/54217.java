public static java.lang.String normalizeSeps(java.lang.String path) {
    if (org.jruby.platform.Platform.IS_WINDOWS) {
        return path.replace(java.io.File.separatorChar, '/');
    }else {
        return path;
    }
}