private void selectDefaultAssignee() {
    java.lang.String logedInUserName = sernet.gs.ui.rcp.main.service.ServiceFactory.lookupAuthService().getUsername();
    java.util.List<sernet.verinice.model.common.configuration.Configuration> allAccounts = taskView.comboModelAccount.getObjectList();
    for (sernet.verinice.model.common.configuration.Configuration account : allAccounts) {
        if (account != null) {
            if (logedInUserName.equals(account.getUser())) {
                taskView.comboModelAccount.setSelectedObject(account);
                taskView.comboAccount.select(taskView.comboModelAccount.getSelectedIndex());
                taskView.selectedAssignee = account.getUser();
            }
        }
    }
}