@org.junit.Test
public void testCodeTypeValueContainsMatch() {
    boolean result = fact.codeTypeValueContainsMatch(java.util.Arrays.asList(eu.europa.ec.fisheries.uvms.rules.service.bean.RuleTestHelper.getCodeType("TEST", null)), "TEST");
    assertTrue(result);
}