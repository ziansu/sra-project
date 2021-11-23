@java.lang.Override
public void afterCreateControl() {
    resetProjectOperationSelectionWithBusyCursor(false);
    alwaysAsk.setSelection(org.talend.repository.ui.login.LoginHelper.isAlwaysAskAtStartup());
    previousButton.setVisible(false);
}