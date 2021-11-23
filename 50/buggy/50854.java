@org.junit.Test
public void testisPositiveInteger() {
    boolean result = fact.isPositiveInteger(java.util.Arrays.asList(eu.europa.ec.fisheries.uvms.rules.service.bean.RuleTestHelper.getMeasureType(new java.math.BigDecimal(22), null)));
    org.junit.Assert.assertTrue(result);
}