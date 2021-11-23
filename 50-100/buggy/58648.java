public void run() {
    while (true) {
        try {
            controller.waitForConnection();
            controller.setUpStreams();
            controller.whileConnected();
            controller.closeStreams();
        } catch (java.io.EOFException eofException) {
            java.lang.System.out.println("\n Server connection ended!");
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    } 
}