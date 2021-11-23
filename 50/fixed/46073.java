@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void nullResourceKey() {
    new org.apache.wicket.model.StringResourceModel(null, page);
}