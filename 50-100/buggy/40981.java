public void run() {
    try {
        server = new java.net.ServerSocket(port);
        client = server.accept();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    while (true) {
        java.lang.String text = receiveMessage();
        if (isTextContent)
            outputToFile(text);
        
    } 
}