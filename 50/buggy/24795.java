@io.qameta.allure.Step(value = "Activate admin")
public void activateAdmin(java.lang.String adminEmail) {
    showInactive();
    table.selectElementCheckboxInTable(adminEmail);
    activateBtn.click();
    modalConfirmWindow.confirmAction();
    waitForJSload();
}