public static void store(java.lang.Object o, java.io.OutputStream fout, java.lang.String encoding) throws java.io.IOException {
    try {
        java.lang.String s = (o == null) ? "" : o.toString();
        fout.write(s.getBytes(encoding));
    } finally {
        fout.close();
    }
}