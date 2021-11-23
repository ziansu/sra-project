@org.junit.Test
public void testUseSpecifiedCharsetIfExists() throws java.lang.Exception {
    final org.apache.logging.log4j.core.layout.PatternLayout layout = org.apache.logging.log4j.core.layout.PatternLayout.newBuilder().withPattern("%m").withConfiguration(ctx.getConfiguration()).withCharset(java.nio.charset.StandardCharsets.UTF_8).build();
    org.junit.Assert.assertEquals(java.nio.charset.StandardCharsets.UTF_8, layout.getCharset());
}