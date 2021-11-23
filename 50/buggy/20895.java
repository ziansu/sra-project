private void updateGroups(final org.eclipse.swt.events.SelectionEvent e) {
    sernet.verinice.rcp.accountgroup.AccountGroupView.getDisplay().syncExec(new sernet.verinice.rcp.accountgroup.AccountGroupView.SelectionEventHandler(e));
}