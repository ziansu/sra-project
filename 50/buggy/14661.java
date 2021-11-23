@org.junit.Test
public void getSimpleResource() {
    org.apache.wicket.model.StringResourceModel model = new org.apache.wicket.model.StringResourceModel("simple.text", page, null);
    assertEquals("Text should be as expected", "Simple text", model.getString());
    assertEquals("Text should be as expected", "Simple text", model.getObject());
}