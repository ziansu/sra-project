@java.lang.Override
public java.lang.Boolean apply(org.openqa.selenium.WebDriver driver) {
    try {
        java.lang.String value = getLocationPreview().getPathAsString();
        currentValue.setLength(0);
        currentValue.append(currentValue);
        return expectedContent.equals(value);
    } catch (org.openqa.selenium.NotFoundException e) {
        return false;
    } catch (org.openqa.selenium.StaleElementReferenceException e) {
        return false;
    }
}