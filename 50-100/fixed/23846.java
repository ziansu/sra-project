@org.junit.Test
public void testGroubBy_with_having_with_function() {
    org.torpedoquery.jpa.test.bo.Entity from = from(org.torpedoquery.jpa.test.bo.Entity.class);
    org.torpedoquery.jpa.test.bo.SubEntity subEntity = innerJoin(from.getSubEntities());
    groupBy(from.getName()).having(sum(from.getIntegerField())).lt(sum(subEntity.getNumberField()));
    org.torpedoquery.jpa.Query<java.lang.String> select = select(from.getName());
    java.lang.String query = select.getQuery();
    assertEquals("select entity_0.name from Entity entity_0 inner join entity_0.subEntities subEntity_1 group by entity_0.name having sum(entity_0.integerField) < sum(subEntity_1.numberField)", query);
}