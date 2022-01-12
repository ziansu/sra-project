private org.openqa.selenium.WebElement findElement(boolean doHighlight) {
    org.finra.jtaf.ewd.widget.element.Element.HIGHLIGHT_MODES highlightMode = (doHighlight) ? org.finra.jtaf.ewd.widget.element.Element.HIGHLIGHT_MODES.FIND : org.finra.jtaf.ewd.widget.element.Element.HIGHLIGHT_MODES.NONE;
    getGUIDriver().selectLastFrame();
    org.openqa.selenium.WebDriver wd = getGUIDriver().getWrappedDriver();
    final org.openqa.selenium.WebElement webElement = wd.findElement(locator);
    try {
        highlight(highlightMode);
    } catch (org.finra.jtaf.ewd.widget.WidgetException e) {
    }
    return webElement;
}