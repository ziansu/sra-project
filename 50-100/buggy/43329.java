@java.lang.Override
public void mouseDoubleClick(org.eclipse.swt.events.MouseEvent e) {
    if ((e.getSource()) == (tableAccountGroups)) {
        sernet.verinice.rcp.accountgroup.EditGroupDialog dialog = new sernet.verinice.rcp.accountgroup.EditGroupDialog(this, parent.getShell(), sernet.gs.ui.rcp.main.bsi.views.Messages.GroupView_19);
        dialog.open();
    }
    if (((e.getSource()) == (tableAccounts)) || ((e.getSource()) == (tableAccountsInGroup))) {
        updateConfiguration();
    }
}