private void SendFileContent(java.net.Socket conn, java.io.InputStream fileIs) throws java.io.IOException {
    java.io.OutputStream os = conn.getOutputStream();
    byte[] b = new byte[1024];
    int x = fileIs.read(b);
    while (x != (-1)) {
        if (x < 1024) {
            b = java.util.Arrays.copyOf(b, x);
        }
        os.write(b);
        x = fileIs.read(b);
    } 
}