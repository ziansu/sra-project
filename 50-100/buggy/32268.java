@java.lang.Override
public void interrupt() {
    try {
        super.interrupt();
        this.httpConnection.getInputStream().close();
        this.fileDestination.close();
        this.isRunning = false;
        this.isDead = true;
    } catch (java.io.IOException e) {
        java.lang.System.out.println(e.getMessage());
    }
}