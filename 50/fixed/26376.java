public void logout() {
    waitUntilAppears(menuDiv);
    menuDiv.click();
    waitUntilAppears(logoutDiv);
    logoutDiv.click();
}