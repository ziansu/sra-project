public void send(java.io.OutputStream stream) {
    java.lang.String headers = (("HTTP/1.0 200 OK\r\n" + ("Content-Type: text/plain\r\n" + "Content-Length: ")) + (response.length())) + "\r\n\r\n";
    try {
        stream.write(headers.getBytes());
        stream.write(response.toString().getBytes());
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(("Exception while writing the response\n" + ex));
    }
}