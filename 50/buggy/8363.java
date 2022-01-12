public org.fundacionjala.automation.framework.pages.tablet.settings.NavigationPage selectConferenceRoom(java.lang.String roomName) {
    org.openqa.selenium.WebElement room = getConferenceRoom(roomName);
    room.click();
    return this;
}