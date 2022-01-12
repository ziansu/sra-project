public java.lang.Object executeImpl(org.eclipse.core.commands.ExecutionEvent event) {
    org.eclipse.jubula.client.core.model.ISpecTestCasePO specTc = org.eclipse.jubula.client.ui.rcp.businessprocess.UINodeBP.getSpecTC(getSelection());
    if (specTc != null) {
        showSpecUINode(specTc, org.eclipse.jubula.client.ui.rcp.controllers.MultipleTCBTracker.getInstance().getMainTCB());
        return null;
    }
    org.eclipse.jubula.client.core.model.ITestSuitePO testSuite = org.eclipse.jubula.client.ui.rcp.businessprocess.UINodeBP.getSpecTS(getSelection());
    if (testSuite != null) {
        org.eclipse.ui.IViewPart view = org.eclipse.jubula.client.ui.rcp.Plugin.showView(Constants.TS_BROWSER_ID);
        showSpecUINode(testSuite, view);
    }
    return null;
}