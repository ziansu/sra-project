@org.junit.Test
public void findTheNumberPositionOfTheWorld() throws java.lang.Exception {
    java.util.List<java.lang.String> messages = java.util.Arrays.asList("Hello", "World!", "How", "Are", "You");
    java.lang.String result = messages.get(1);
    org.junit.Assert.assertEquals("World!", result);
}