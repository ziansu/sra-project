@org.junit.Test
public void whatIsLastNow() throws java.lang.Exception {
    java.util.List<java.lang.String> messages = java.util.Arrays.asList("Hello", "World!", "How", "Are", "You");
    messages.set(4, "The rest of them");
    java.lang.String result = messages.get(4);
    org.junit.Assert.assertEquals("The rest of them", result);
}