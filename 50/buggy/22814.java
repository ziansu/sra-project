public void keepClicking(org.openqa.selenium.By waitBy) {
    java.lang.Boolean isStarted = false;
    while (!isStarted) {
        try {
            seleniumHelper.clickUtilClickable(waitBy, quickRefreshWait);
            isStarted = true;
        } catch (java.lang.Exception ex) {
            isStarted = false;
        }
    } 
}