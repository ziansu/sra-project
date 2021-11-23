@java.lang.Override
public int read(java.net.Socket socket) throws java.io.IOException {
    java.io.InputStream is = socket.getInputStream();
    java.io.InputStreamReader isr = new java.io.InputStreamReader(is);
    java.io.BufferedReader br = new java.io.BufferedReader(isr);
    java.lang.String data = br.readLine();
    return java.lang.Integer.parseInt(data);
}