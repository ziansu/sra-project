public void run() {
    try {
        while (connectionAlive) {
            java.lang.String recvd = readRequest(so.getInputStream());
            if (recvd != null)
                process(recvd);
            
        } 
        java.lang.System.out.println("Closed Socket");
        so.close();
    } catch (java.lang.Exception e) {
        java.lang.System.err.println("CS: Error processing request\n");
        e.printStackTrace();
    }
}