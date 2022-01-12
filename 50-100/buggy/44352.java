protected void openProject(org.talend.core.model.general.Project project) {
    if (project == null) {
        return ;
    }
    org.talend.repository.ui.login.LoginHelper.setRepositoryContextInContext(defaultConnectionBean, org.talend.repository.ui.login.LoginHelper.getUser(defaultConnectionBean), project, SVNConstant.NAME_TRUNK);
    if (loginHelper.logIn(defaultConnectionBean, project)) {
        loginHelper.saveLastConnectionBean(defaultConnectionBean);
        loginHelper.getPrefManipulator().setLastProject(project.getLabel());
        org.talend.repository.ui.login.LoginHelper.setAlwaysAskAtStartup(alwaysAsk.getSelection());
        org.talend.repository.ui.login.LoginHelper.refreshTalendLogonStartupTimes();
        loginDialog.okPressed();
    }
}