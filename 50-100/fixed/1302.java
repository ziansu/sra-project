private static org.epsg.openconfigurator.model.PowerlinkRootNode getNodelist() {
    org.eclipse.ui.IViewPart viewPart = org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().findView(IndustrialNetworkView.ID);
    if (viewPart instanceof org.epsg.openconfigurator.views.IndustrialNetworkView) {
        org.epsg.openconfigurator.views.IndustrialNetworkView industrialView = ((org.epsg.openconfigurator.views.IndustrialNetworkView) (viewPart));
        org.epsg.openconfigurator.model.PowerlinkRootNode nodeList = industrialView.getNodeList();
        return nodeList;
    }
    return null;
}