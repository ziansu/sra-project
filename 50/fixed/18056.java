@org.junit.Test
public void splitWithTrailingDelimiters() {
    assertArrayEquals(new java.lang.String[]{ "foo" , "bar" }, split("foo!bar!!", '!'));
}