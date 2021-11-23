public void start() throws java.io.IOException {
    java.io.BufferedReader reader = null;
    java.io.PrintWriter writer = null;
    try {
        reader = new java.io.BufferedReader(new java.io.InputStreamReader(socket.getInputStream()));
        writer = new java.io.PrintWriter(new java.io.OutputStreamWriter(socket.getOutputStream()));
        handleClient(reader, writer);
    } finally {
        if (writer != null)
            writer.close();
        
        if (reader != null)
            reader.close();
        
    }
}