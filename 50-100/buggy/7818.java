@java.lang.Override
public void connect() throws de.mickare.xserver.exceptions.NotInitializedException, java.io.IOException, java.lang.InterruptedException {
    try (de.mickare.xserver.util.concurrent.CloseableLock c = conLock.writeLock().open()) {
        if ((!(this.manager.isRunning())) || (!(valid()))) {
            return ;
        }
        manager.debugInfo((("Connecting to " + (this.name)) + " ..."));
        new de.mickare.xserver.net.ConnectionObj(manager.getSocketFactory(), host, port, this, manager);
    }
}