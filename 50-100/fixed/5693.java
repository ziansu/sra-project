@org.junit.Test
public void testAutoReFocusWRadioButtons() {
    java.lang.String[] paths = new java.lang.String[]{ (com.github.bordertech.wcomponents.examples.AutoReFocusRepeaterExample_Test.ROOT_PATH) + "[0]/WRadioButtonTriggerActionExample/WRadioButton" , (com.github.bordertech.wcomponents.examples.AutoReFocusRepeaterExample_Test.ROOT_PATH) + "[1]/WRadioButtonTriggerActionExample/WRadioButton" };
    for (java.lang.String path : paths) {
        com.github.bordertech.wcomponents.examples.AutoReFocusRepeaterExample_Test.driver.findWRadioButton(byWComponentPath(path)).getInputField().click();
        junit.framework.Assert.assertEquals("Incorrect focus", com.github.bordertech.wcomponents.examples.AutoReFocusRepeaterExample_Test.driver.findWRadioButton(byWComponentPath(path)).getActiveId(), com.github.bordertech.wcomponents.examples.AutoReFocusRepeaterExample_Test.driver.switchTo(true).activeElement().getAttribute("id"));
    }
}