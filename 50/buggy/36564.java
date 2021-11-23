public void cancelOperation() {
    hideProgressPanel();
    org.eclipse.core.runtime.IProgressMonitor progressMonitor = getProgressMonitor();
    disconnectFromProgressPanel();
    progressMonitor.setCanceled(true);
}