private void createAccountsInGroupColumn() {
    org.eclipse.swt.widgets.Group accountsInGroupColumn = new org.eclipse.swt.widgets.Group(container, org.eclipse.swt.SWT.NONE);
    accountsInGroupColumn.setText(Messages.GroupView_3);
    {
        tableAccountsInGroup = new org.eclipse.jface.viewers.TableViewer(accountsInGroupColumn);
        tableAccountsInGroup.setContentProvider(new sernet.verinice.rcp.accountgroup.AccountContentProvider(tableAccountsInGroup));
        tableAccountsInGroup.setLabelProvider((groupLabelProvider = new sernet.verinice.rcp.accountgroup.AccountLabelProvider()));
        tableAccountsInGroup.setComparator(new sernet.verinice.rcp.accountgroup.GroupView.AccountComparator());
        tableAccountsInGroup.refresh(true);
        org.eclipse.jface.layout.GridLayoutFactory.fillDefaults().margins(sernet.verinice.rcp.accountgroup.GroupView.MARGINS).spacing(sernet.verinice.rcp.accountgroup.GroupView.SPACING).generateLayout(accountsInGroupColumn);
    }
}