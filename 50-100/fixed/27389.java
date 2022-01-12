@org.junit.Test
public void testSingleGroubBy() {
    org.torpedoquery.jpa.test.bo.Entity from = from(org.torpedoquery.jpa.test.bo.Entity.class);
    groupBy(from.getName());
    org.torpedoquery.jpa.Query<java.lang.Object[]> select = select(from.getName(), sum(from.getIntegerField()));
    java.lang.String query = select.getQuery();
    assertEquals("select entity_0.name, sum(entity_0.integerField) from Entity entity_0 group by entity_0.name", query);
}