@java.lang.Override
public void beforeChangeValueOf(org.openqa.selenium.WebElement element, org.openqa.selenium.WebDriver driver, java.lang.CharSequence[] charSequence) {
    this.listener.beforeChangeValueOf((element == null ? null : instantiator.newComponent(org.fluentlenium.core.domain.FluentWebElement.class, element)), driver, charSequence);
}