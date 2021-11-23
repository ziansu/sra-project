public void openFiles(com.apple.eawt.AppEvent.OpenFilesEvent e) {
    for (java.io.File file : e.getFiles()) {
        new de.unistuttgart.ims.annotationviewer.XMIViewer(file);
    }
}