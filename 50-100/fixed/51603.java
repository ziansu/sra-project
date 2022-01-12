public java.lang.String long_press(java.util.Hashtable<java.lang.String, java.lang.String> getvalue, java.lang.String linkName) {
    try {
        org.openqa.selenium.WebElement pages = element(linkName);
        org.openqa.selenium.interactions.touch.TouchActions longpress = new org.openqa.selenium.interactions.touch.TouchActions(mobdriv).longPress(pages);
        longpress.perform();
        return "pass";
    } catch (java.lang.Exception ex) {
        reportError(((("Fail to long press on -" + linkName) + " reason :") + (ex.getMessage())));
        return "fail";
    }
}