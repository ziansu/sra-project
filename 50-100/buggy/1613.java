@org.robotframework.javalib.annotation.RobotKeyword
@org.robotframework.javalib.annotation.ArgumentNames(value = { "locator" , "*values" })
public void selectFromListByValue(java.lang.String locator, java.lang.String... values) {
    if ((values.length) == 0) {
        throw new com.github.markusbernhardt.selenium2library.Selenium2LibraryNonFatalException("No value given.");
    }
    java.lang.String items = java.lang.String.format("value(s) '%s'", com.github.markusbernhardt.selenium2library.utils.Python.join(", ", values));
    logging.info(java.lang.String.format("Selecting %s from list '%s'.", items, locator));
    org.openqa.selenium.support.ui.Select select = getSelectList(locator);
    for (java.lang.String value : values) {
        select.selectByValue(value);
    }
}