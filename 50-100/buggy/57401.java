private void writeResponse(java.net.Socket s, java.lang.String responseAppend) throws java.io.IOException {
    java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.OutputStreamWriter(s.getOutputStream()));
    java.lang.String response = ("HTTP/1.1 200 OK\r\n" + "Server: Jacopo\'s social media fetcher\r\n") + responseAppend;
    bw.write(response);
    bw.flush();
    bw.close();
}