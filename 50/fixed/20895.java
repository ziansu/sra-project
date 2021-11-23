private void updateGroups(final org.eclipse.swt.events.SelectionEvent event) {
    sernet.verinice.rcp.accountgroup.AccountGroupView.getDisplay().syncExec(new sernet.verinice.rcp.accountgroup.AccountGroupView.SelectionEventHandler(event));
}