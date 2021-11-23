protected void startWaiting(java.lang.String message, boolean canStop) {
    java.lang.String queue = (javax.swing.SwingUtilities.isEventDispatchThread()) ? "event dispatch thread." : ("a separate thread (" + (java.lang.Thread.currentThread().getName())) + ").";
    java.lang.System.out.println(("Start waiting called from " + queue));
    org.gridchem.client.gui.filebrowser.FileBrowserImpl.progress.setIndeterminate(true);
    org.gridchem.client.gui.filebrowser.FileBrowserImpl.progressInfo.setText(message);
}