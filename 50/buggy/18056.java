@org.junit.Test
public void splitWithTrailingDelimiters() {
    assertArrayEquals(new java.lang.String[]{ "foo" , "bar" }, io.netty.util.internal.StringUtil.split("foo!bar!!", '!'));
}