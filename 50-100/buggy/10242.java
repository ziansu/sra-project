@java.lang.Override
protected void execute(org.eclipse.core.resources.IMarker selectedMarker) {
    try {
        org.sonarlint.eclipse.ui.internal.views.IssueLocationsView view = ((org.sonarlint.eclipse.ui.internal.views.IssueLocationsView) (org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(IssueLocationsView.ID)));
        view.setInput(selectedMarker);
    } catch (java.lang.Exception e) {
        org.sonarlint.eclipse.core.SonarLintLogger.get().error("Unable to open Issue Location View", e);
    }
}