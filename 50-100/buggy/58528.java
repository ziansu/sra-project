private void iosExpandAllDirectory() throws java.lang.Exception {
    boolean checkArrowDown;
    checkArrowDown = checkElementTextViewRoboReturn("\u25bc");
    if (checkArrowDown == true) {
        scrollToLastElementIOS("\u25bc");
    }
    while (checkArrowDown == true) {
        clickButtonByNameScroll("\u25bc");
        checkArrowDown = checkElementTextViewRoboReturn("\u25bc");
        if (checkArrowDown == true) {
            scrollToLastElementIOS("\u25bc");
            java.lang.Thread.sleep(1000);
        }
    } 
}