public static long transfer(java.io.InputStream in, java.io.File target) throws java.io.IOException {
    java.io.FileOutputStream out = null;
    try {
        out = new java.io.FileOutputStream(target);
        return org.qfox.jestful.core.io.IOUtils.transfer(in, out);
    } finally {
        org.qfox.jestful.core.io.IOUtils.close(out);
    }
}