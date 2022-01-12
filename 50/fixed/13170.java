public void close() {
    try {
        isRunning = false;
        if ((client) != null)
            client.close();
        
        select.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}