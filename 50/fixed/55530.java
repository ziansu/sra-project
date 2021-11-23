@java.lang.Override
public void run() {
    java.lang.System.out.println("Saving Backup");
    saveWorkspace(watcher.workspace, new java.io.File(((watcher.workspace.getFile().getAbsolutePath()) + "~")), false);
    java.lang.System.out.println("Finished");
}