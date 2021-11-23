@org.junit.Test
public void testWithRecord() {
    java.util.Map<java.lang.String, java.lang.Object> testElement = com.google.common.collect.ImmutableMap.of("name", "Bob");
    org.neo4j.driver.v1.Record rec = iethw.neo4j.driver.testkit.data.EmbeddedTestkitRecordFactory.create(testElement);
    final java.lang.String result = iethw.neo4j.driver.util.PrettyPrinter.toString(rec);
    java.lang.System.out.println(result);
    assertTrue("<name=\"Bob\">".equals(result));
}