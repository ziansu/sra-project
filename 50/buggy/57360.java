public static void store(java.lang.Object o, java.io.File out, java.lang.String encoding) throws java.io.IOException {
    java.io.FileOutputStream fout = new java.io.FileOutputStream(out);
    try {
        aQute.lib.io.IO.store(o, fout, encoding);
    } finally {
        fout.close();
    }
}