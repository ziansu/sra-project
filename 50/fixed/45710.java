public void stop() {
    try {
        sshServer.stop();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}