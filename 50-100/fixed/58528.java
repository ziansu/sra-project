private void iosExpandAllDirectory() throws java.lang.Exception {
    boolean checkArrowDown;
    checkArrowDown = checkElementTextViewRoboReturn("\u25bc");
    if (checkArrowDown == true) {
        while (checkArrowDown == true) {
            scrollToLastElementIOS("\u25bc");
            java.lang.Thread.sleep(1000);
            checkArrowDown = checkElementTextViewRoboReturn("\u25bc");
        } 
    }
}