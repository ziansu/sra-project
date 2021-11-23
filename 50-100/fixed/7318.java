@org.junit.Test
public void testUsePlatformDefaultIfNoCharset() throws java.lang.Exception {
    final org.apache.logging.log4j.core.layout.PatternLayout layout = org.apache.logging.log4j.core.layout.PatternLayout.newBuilder().withPattern("%m").withConfiguration(ctx.getConfiguration()).build();
    assertEquals(java.nio.charset.Charset.defaultCharset(), layout.getCharset());
}