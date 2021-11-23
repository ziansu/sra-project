public void closeWindow(java.lang.String winHandle) {
    if (winHandle.equals(getWindowOnFocusHandle())) {
        getDriver().close();
        refreshWindowsList(getDriver(), false);
    }else {
        getDriver().switchTo().window(winHandle);
        getDriver().close();
        refreshWindowsList(getDriver(), false);
    }
}