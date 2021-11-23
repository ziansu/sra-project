public void run() {
    java.lang.System.err.println("Handling connection...");
    try {
        java.io.InputStream is = socket.getInputStream();
        java.io.OutputStream os = socket.getOutputStream();
        readHTTPRequest(is);
        writeHTTPHeader(os, "text/html");
        writeContent(os, "text/html");
        os.flush();
        socket.close();
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(("Output error: " + e));
    }
    java.lang.System.err.println("Done handling connection.");
    return ;
}