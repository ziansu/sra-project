@java.lang.Override
public void run() {
    try {
        inFromClient = new java.io.BufferedReader(new java.io.InputStreamReader(threadSocket.getInputStream()));
        while ((!(spade.reporter.LLVM.shutdown)) || (inFromClient.ready())) {
            java.lang.String line = inFromClient.readLine();
            if (line != null) {
                parseEvent(line);
            }
            java.lang.Thread.sleep(spade.reporter.LLVM.THREAD_SLEEP_DELAY);
        } 
        inFromClient.close();
    } catch (java.lang.Exception exception) {
        exception.printStackTrace(java.lang.System.err);
    }
}