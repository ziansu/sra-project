@org.junit.Test
public void testShouldReturnMethodValueRetrieverWhenMethodPassedWithArgs() throws java.lang.Exception {
    givenCommandLineArguments("test(1, \"test\")");
    org.junit.Assert.assertEquals(java.util.Collections.singletonList(new uk.co.harrymartland.multijmx.domain.valueretriver.SpelMethodValueRetriever("test", java.util.Arrays.asList(new uk.co.harrymartland.multijmx.domain.typeable.ObjectType(1), new uk.co.harrymartland.multijmx.domain.typeable.ObjectType("test")))), getOptionValue().getValue());
}