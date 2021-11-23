@org.junit.Test
public void findLightDomElementById() throws java.lang.Exception {
    openTestURL();
    com.vaadin.tests.elements.PolymerTemplateViewElement view = $(com.vaadin.tests.elements.PolymerTemplateViewElement.class).waitForFirst();
    com.vaadin.tests.elements.NativeButtonElement button = view.$(com.vaadin.tests.elements.NativeButtonElement.class).id("light-button-1");
    org.junit.Assert.assertEquals("Button 1", button.getText());
}