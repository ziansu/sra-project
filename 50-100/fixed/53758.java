public static java.lang.String getAttribute(org.openqa.selenium.WebElement e, java.lang.String cssSelector, java.lang.String attr) {
    java.lang.String res;
    try {
        res = e.findElement(org.openqa.selenium.By.cssSelector(cssSelector)).getAttribute(attr);
    } catch (org.openqa ex) {
        res = "";
    } catch (org.openqa ex) {
        res = "";
    }
    return res;
}