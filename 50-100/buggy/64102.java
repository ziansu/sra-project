@java.lang.Override
public void write(java.net.Socket socket) throws java.io.IOException {
    java.io.OutputStream os = socket.getOutputStream();
    java.io.OutputStreamWriter osw = new java.io.OutputStreamWriter(os);
    java.io.BufferedWriter bw = new java.io.BufferedWriter(osw);
    java.lang.String data = OtrioOL.OLClient.input;
    data = data + "\n";
    bw.write(data);
    bw.flush();
}