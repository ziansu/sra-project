@java.lang.Override
public void restart() throws java.io.IOException {
    this.getService().start();
    this.getService().stop();
}