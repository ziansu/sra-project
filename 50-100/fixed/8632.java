@org.junit.Test
public void openHelpWindow() {
    this.commandBox.clickOnTextField();
    assertHelpWindowOpen(this.mainMenu.openHelpWindowUsingAccelerator());
    this.resultDisplay.clickOnTextArea();
    assertHelpWindowOpen(this.mainMenu.openHelpWindowUsingAccelerator());
    this.taskListPanel.clickOnListView();
    assertHelpWindowOpen(this.mainMenu.openHelpWindowUsingAccelerator());
    assertHelpWindowOpen(this.mainMenu.openHelpWindowUsingMenu());
    assertHelpWindowOpen(this.commandBox.runHelpCommand());
}