public void rawSend(java.lang.String message) throws java.io.IOException {
    while (!(isConnected())) {
        if (!(mConnectLock.isLocked())) {
            connect();
        }else {
            try {
                java.lang.Thread.sleep(100);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    } 
    java.io.PrintWriter output_stream = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.OutputStreamWriter(mServerSocket.getOutputStream())), true);
    output_stream.println(message);
}