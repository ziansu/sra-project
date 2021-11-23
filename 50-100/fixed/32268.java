@java.lang.Override
public void interrupt() {
    if (this.isRunning) {
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
}