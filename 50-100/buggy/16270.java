public void run() {
    while (true) {
        try {
            contr.connectToServer();
            contr.setupStreams();
            contr.getUserInfo();
        } catch (java.io.EOFException eofException) {
            java.lang.System.out.println("\nClient terminated the connection!\n");
        } catch (java.io.IOException ioException) {
            ioException.printStackTrace();
        }
    } 
}