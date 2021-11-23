public com.wolfram.cloud.DevPlatformHomePage openNewFileDropdown() {
    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(this.newNotebookBtnDropdown));
    this.newNotebookBtnDropdown.click();
    return this;
}