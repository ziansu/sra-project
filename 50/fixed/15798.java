@java.lang.Override
public void run() {
    if ((this.applicationContext) != null) {
        this.applicationContext.close();
    }
    this.loggingSystemShutdownHandler.run();
}