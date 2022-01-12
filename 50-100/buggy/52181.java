@org.junit.Test
public void testHavingFunctionParameterMustBeConvertToString() {
    org.torpedoquery.jpa.test.bo.Entity from = from(org.torpedoquery.jpa.test.bo.Entity.class);
    groupBy(from.getIntegerField()).having(from.getBigDecimalField()).gt(coalesce(sum(from.getBigDecimalField2()), constant(java.math.BigDecimal.ZERO)));
    org.torpedoquery.jpa.Query<java.lang.Integer> select = select(sum(from.getIntegerField()));
    org.junit.Assert.assertEquals("select sum(entity_0.integerField) from Entity entity_0 group by entity_0.integerField having entity_0.bigDecimalField > coalesce(sum(entity_0.bigDecimalField2),0)", select.getQuery());
}