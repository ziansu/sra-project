@org.junit.Test
public void testGetAllValidationRules() {
    validationRuleService.saveValidationRule(validationRuleA);
    validationRuleService.saveValidationRule(validationRuleB);
    java.util.Collection<org.hisp.dhis.validation.ValidationRule> rules = validationRuleService.getAllValidationRules();
    assertTrue(((rules.size()) == 2));
    assertTrue(rules.contains(validationRuleA));
    assertTrue(rules.contains(validationRuleB));
}