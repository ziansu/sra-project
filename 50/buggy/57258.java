@org.junit.Test
public void test_escape_period() {
    java.lang.String input = "{\"files\":{\"test.txt\":\"Hello, world!\"}}";
    com.afollestad.ason.Ason object = new com.afollestad.ason.Ason(input);
    org.junit.Assert.assertEquals("Hello, world!", object.get("files.test\\.txt"));
}