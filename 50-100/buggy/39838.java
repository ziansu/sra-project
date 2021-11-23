public void finishPressed() {
    if (org.talend.repository.ui.login.LoginProjectPage.isRestart) {
        loginDialog.okPressed();
    }else {
        boolean isLogInOk = loginHelper.logIn(getConnection(), getProject());
        if (isLogInOk) {
            org.talend.repository.ui.login.LoginHelper.setAlwaysAskAtStartup(alwaysAsk.getSelection());
            org.talend.repository.ui.login.LoginHelper.refreshTalendLogonStartupTimes();
            loginDialog.okPressed();
        }else {
            fillUIProjectListWithBusyCursor();
        }
    }
}