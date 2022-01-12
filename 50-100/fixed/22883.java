public static java.util.List<org.openqa.selenium.WebElement> getList(org.openqa.selenium.WebElement from, java.lang.String cssSelector) {
    java.util.List<org.openqa.selenium.WebElement> l;
    try {
        l = from.findElements(org.openqa.selenium.By.cssSelector(cssSelector));
    } catch (org.openqa e) {
        l = new java.util.ArrayList<org.openqa.selenium.WebElement>();
    } catch (org.openqa e) {
        l = new java.util.ArrayList<org.openqa.selenium.WebElement>();
    }
    return l;
}