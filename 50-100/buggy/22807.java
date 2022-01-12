@org.junit.Test
public void getWrappedOnAssignmentResource() {
    org.apache.wicket.markup.html.basic.Label label1 = new org.apache.wicket.markup.html.basic.Label("resourceModelWithComponent", new org.apache.wicket.model.StringResourceModel("wrappedOnAssignment.text", page, null));
    page.add(label1);
    assertEquals("Text should be as expected", "Non-wrapped text", label1.getDefaultModelObject());
    org.apache.wicket.markup.html.basic.Label label2 = new org.apache.wicket.markup.html.basic.Label("resourceModelWithoutComponent", new org.apache.wicket.model.StringResourceModel("wrappedOnAssignment.text", ((org.apache.wicket.Component) (null)), null));
    page.add(label2);
    assertEquals("Text should be as expected", "Wrapped text", label2.getDefaultModelObject());
}