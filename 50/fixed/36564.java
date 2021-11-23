public void cancelOperation() {
    hideProgressPanel();
    org.eclipse.core.runtime.IProgressMonitor progressMonitor = getProgressMonitor();
    progressMonitor.setCanceled(true);
    disconnectFromProgressPanel();
}