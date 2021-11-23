@java.lang.Override
public void run() {
    if ((folder.getLastRequestTime()) != null) {
        folder.refreshFolder(folder.getLastRequestTime());
    }else {
        folder.refreshFolder();
    }
}