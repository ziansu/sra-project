@org.junit.Test
public void testWithEmptyRelationshipProperties() {
    java.util.Map<java.lang.String, org.neo4j.driver.v1.Value> relationshipProperties = com.google.common.collect.ImmutableMap.of();
    org.neo4j.driver.v1.types.Relationship rel = new org.neo4j.driver.internal.InternalRelationship(5, 1, 2, "REL", relationshipProperties);
    final java.lang.String result = iethw.neo4j.driver.util.PrettyPrinter.toString(rel);
    java.lang.System.out.println(result);
    assertTrue("(1)-[:REL]-(2)".equals(result));
}