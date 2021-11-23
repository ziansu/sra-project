@java.lang.Override
protected void done() {
    super.done();
    try {
        iconCache = new java.lang.ref.SoftReference<>(super.get());
        progressHandle.finish();
        fireIconChange();
        if ((timer) != null) {
            timer.stop();
            timer = null;
        }
    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException ex) {
        org.sleuthkit.autopsy.coreutils.Logger.getLogger(org.sleuthkit.autopsy.corecomponents.ThumbnailViewNode.class.getName()).log(java.util.logging.Level.SEVERE, "Error getting thumbnail icon", ex);
    }
    swingWorker = null;
}