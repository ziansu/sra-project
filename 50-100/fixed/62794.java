public static void copy(java.io.PrintWriter out, java.io.InputStream stream) throws java.io.IOException {
    java.io.InputStreamReader reader = new java.io.InputStreamReader(stream);
    char[] buffer = new char[1024];
    int len = reader.read(buffer);
    while (len != (-1)) {
        out.write(buffer, 0, len);
        len = reader.read(buffer);
    } 
    reader.close();
}