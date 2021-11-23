private org.openqa.selenium.WebElement getLineByName(java.lang.String name) {
    java.util.List<org.openqa.selenium.WebElement> lines = getLines();
    for (org.openqa.selenium.WebElement el : lines) {
        if (getLineName(el).contains(name))
            return el;
        
    }
    return null;
}