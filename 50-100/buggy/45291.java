public void handle_option_request(java.io.BufferedReader in, java.lang.String line) throws java.io.IOException {
    java.io.BufferedWriter out = new java.io.BufferedWriter(new java.io.OutputStreamWriter(socket.getOutputStream()));
    out.write("HTTP/1.1 200 OK\r\n");
    out.write("Content-Type: text/html\r\n");
    out.write("Access-Control-Allow-Origin: *\r\n");
    out.write("Access-Control-Allow-Headers: accept, content-type\r\n");
    out.write("Access-Control-Allow-Methods: POST\r\n");
    out.write(new java.util.Date().toString());
    out.write("\r\n");
    out.flush();
    out.close();
    in.close();
    socket.close();
}