public void run() {
    org.eclipse.ui.IWorkbenchPage page = org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
    try {
        org.eclipse.ui.IViewPart viewPart = page.showView("com.google.test.metric.eclipse.ui.browserview");
        if (viewPart instanceof com.google.test.metric.eclipse.ui.TestabilityReportView) {
            ((com.google.test.metric.eclipse.ui.TestabilityReportView) (viewPart)).setUrl(((reportDirectory.getAbsolutePath()) + "/index.html"));
        }
    } catch (org.eclipse.ui.PartInitException e) {
        logger.logException("Error initializing Testability View", e);
    } catch (java.net.MalformedURLException e) {
        e.printStackTrace();
    }
}