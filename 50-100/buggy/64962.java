@org.junit.Test
public void testWithUnsupportedEntityList() {
    iethw.neo4j.driver.util.PrettyPrintingNodeTest.UnsupportedTestEntity entity = new iethw.neo4j.driver.util.PrettyPrintingNodeTest.UnsupportedTestEntity();
    java.util.List<org.neo4j.driver.v1.types.Entity> testEntityList = new java.util.ArrayList<>();
    testEntityList.add(entity);
    final java.lang.String resultForSingleUnsupportedEntity = iethw.neo4j.driver.util.PrettyPrinter.toString(testEntityList);
    java.lang.System.out.println(resultForSingleUnsupportedEntity);
    assertTrue(resultForSingleUnsupportedEntity.equals("[]"));
    testEntityList.add(entity);
    final java.lang.String resultForMultipleUnsupportedEntities = iethw.neo4j.driver.util.PrettyPrinter.toString(testEntityList);
    java.lang.System.out.println(resultForMultipleUnsupportedEntities);
    assertTrue(resultForMultipleUnsupportedEntities.equals("[]"));
}