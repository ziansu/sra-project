public static void store(java.lang.Object o, java.io.OutputStream fout, java.lang.String encoding) throws java.io.IOException, java.io.UnsupportedEncodingException {
    java.lang.String s;
    if (o == null)
        s = "";
    else
        s = o.toString();
    
    try {
        fout.write(s.getBytes(encoding));
    } finally {
        fout.close();
    }
}