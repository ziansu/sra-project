protected void installPropertyChangeListener(java.lang.Object element) {
    org.eclipse.tcf.te.ui.interfaces.IViewerInput viewerInput = org.eclipse.tcf.te.ui.trees.ViewerStateManager.getViewerInput(element);
    if ((viewerInput != null) && (!(viewerInputs.contains(viewerInput)))) {
        viewerInput.addPropertyChangeListener(commonViewerListener);
        viewerInputs.add(viewerInput);
    }
}