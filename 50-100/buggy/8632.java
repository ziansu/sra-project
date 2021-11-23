@org.junit.Test
public void openHelpWindow() {
    commandBox.clickOnTextField();
    assertHelpWindowOpen(mainMenu.openHelpWindowUsingAccelerator());
    resultDisplay.clickOnTextArea();
    assertHelpWindowOpen(mainMenu.openHelpWindowUsingAccelerator());
    taskListPanel.clickOnListView();
    assertHelpWindowOpen(mainMenu.openHelpWindowUsingAccelerator());
    browserPanel.clickOnWebView();
    assertHelpWindowNotOpen(mainMenu.openHelpWindowUsingAccelerator());
    assertHelpWindowOpen(mainMenu.openHelpWindowUsingMenu());
    assertHelpWindowOpen(commandBox.runHelpCommand());
}