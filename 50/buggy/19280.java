@java.lang.Override
public void run() {
    this.log.debug("IndexDocumentContentUpdateTaskLauncher starting thread responsible for ES import/deletion checking");
    executeCheckForContentUpdates();
}