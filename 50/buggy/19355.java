@java.lang.Override
public void run() {
    com.impavidly.util.backup.Backup backup = this;
    backup.setChanged();
    backup.notifyObservers(getRecord());
}