protected static void stopWaiting() {
    java.lang.String queue = (javax.swing.SwingUtilities.isEventDispatchThread()) ? "event dispatch thread." : ("a separate thread (" + (java.lang.Thread.currentThread().getName())) + ").";
    java.lang.System.out.println(("Stop waiting called from " + queue));
    org.gridchem.client.gui.filebrowser.FileBrowserImpl.progress.setIndeterminate(false);
    org.gridchem.client.gui.filebrowser.FileBrowserImpl.progress.setValue(0);
    org.gridchem.client.gui.filebrowser.FileBrowserImpl.progressInfo.setText(" ");
}