public com.wikia.webdriver.elements.oasis.components.templateclassificiation.TemplateClassification changeTemplateType(java.lang.String templateName) {
    typeInput = driver.findElement(org.openqa.selenium.By.cssSelector(("#template-classification-" + (templateName.toLowerCase()))));
    wait.forElementClickable(typeInput);
    typeInput.click();
    com.wikia.webdriver.common.logging.PageObjectLogging.logInfo((templateName + " template was chosen"));
    return this;
}