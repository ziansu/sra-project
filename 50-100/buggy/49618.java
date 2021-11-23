private void createPlanHTMLTab(org.eclipse.swt.widgets.TabFolder folderParent) {
    org.eclipse.swt.widgets.Composite tabPanel = createHTMLViewerPanel(folderParent);
    org.eclipse.swt.widgets.TabItem planHTMLTab = new org.eclipse.swt.widgets.TabItem(folderParent, org.eclipse.swt.SWT.NONE);
    planHTMLTab.setControl(tabPanel);
    planHTMLTab.setText(org.teiid.datatools.connectivity.ui.Messages.getString(((org.teiid.datatools.views.ExecutionPlanView.PREFIX) + "planViewerHTMLTab.name")));
}