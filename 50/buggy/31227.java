@java.lang.Override
public void afterCreateControl() {
    resetProjectOperationSelectionWithBusyCursor();
    alwaysAsk.setSelection(org.talend.repository.ui.login.LoginHelper.isAlwaysAskAtStartup());
    previousButton.setVisible(false);
}