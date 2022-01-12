@java.lang.Override
public void mouseDoubleClick(org.eclipse.swt.events.MouseEvent event) {
    if ((event.getSource()) == (tableAccountGroups)) {
        sernet.verinice.rcp.accountgroup.EditGroupDialog dialog = new sernet.verinice.rcp.accountgroup.EditGroupDialog(this, parent.getShell(), sernet.gs.ui.rcp.main.bsi.views.Messages.GroupView_19);
        dialog.open();
    }
    if (((event.getSource()) == (tableAccounts)) || ((event.getSource()) == (tableAccountsInGroup))) {
        updateConfiguration();
    }
}