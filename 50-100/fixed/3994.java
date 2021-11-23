public java.lang.String getValue(java.lang.String nameOrId) throws java.lang.Exception {
    org.openqa.selenium.WebElement elem = new org.spo.fw.web.Util_WebElementQueryHelper(driver).query(nameOrId);
    if (!(elem.getTagName().equals("select"))) {
        return elem.getAttribute("value");
    }else {
        final org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(elem);
        return select.getFirstSelectedOption().getText();
    }
}