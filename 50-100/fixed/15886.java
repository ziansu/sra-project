public void startRunning() {
    try {
        connectToServer();
        setupStreams();
        whileCompile();
    } catch (java.io.EOFException eofException) {
        java.lang.System.out.println("Client terminated connection");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
    }
}