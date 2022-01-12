@org.junit.Test
public void testCamel() {
    assertEquals("HelloWorld", leap.lang.Strings.upperCamel("hello_world", '_'));
    assertEquals("HelloWorld", leap.lang.Strings.upperCamel("hello_world_", '_'));
    assertEquals("HelloWorld", leap.lang.Strings.upperCamel("helloWorld", '_'));
    assertEquals("helloWorld", leap.lang.Strings.lowerCamel("hello_world", '_'));
    assertEquals("helloWorld", leap.lang.Strings.lowerCamel("hello_world_", '_'));
    assertEquals("helloWorld", leap.lang.Strings.lowerCamel("HelloWorld", '_'));
}