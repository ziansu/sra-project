public static long transfer(java.io.File source, java.io.OutputStream out) throws java.io.IOException {
    java.io.FileInputStream in = null;
    try {
        in = new java.io.FileInputStream(source);
        return org.qfox.jestful.core.io.IOUtils.transfer(in, out);
    } finally {
        org.qfox.jestful.core.io.IOUtils.close(in);
    }
}