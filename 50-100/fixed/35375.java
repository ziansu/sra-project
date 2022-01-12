public static long transfer(java.io.File source, java.io.File target) throws java.io.IOException {
    java.io.FileInputStream in = null;
    java.io.FileOutputStream out = null;
    try {
        in = new java.io.FileInputStream(source);
        out = new java.io.FileOutputStream(target);
        return org.qfox.jestful.core.io.IOUtils.transfer(in, out);
    } finally {
        org.qfox.jestful.core.io.IOUtils.close(in);
        org.qfox.jestful.core.io.IOUtils.close(out);
    }
}