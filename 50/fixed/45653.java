@java.lang.Override
public boolean apply(org.openqa.selenium.WebDriver input) {
    java.util.List<java.lang.String> errors = getErrors();
    return errors.contains(expected);
}