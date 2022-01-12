private org.eclipse.smarthome.automation.Rule createACRule() {
    java.util.Map<java.lang.String, java.lang.Object> config = new java.util.HashMap<java.lang.String, java.lang.Object>();
    config.put(org.eclipse.smarthome.automation.sample.extension.java.WelcomeHomeRulesProvider.CONFIG_UNIT, "Air Conditioner");
    config.put(org.eclipse.smarthome.automation.sample.extension.java.WelcomeHomeRulesProvider.CONFIG_EXPECTED_RESULT, "The air conditioner is switched on.");
    config.put(AirConditionerRuleTemplate.CONFIG_TARGET_TEMPERATURE, new java.lang.Integer(18));
    config.put(AirConditionerRuleTemplate.CONFIG_OPERATION, TemperatureConditionType.OPERATOR_HEATING);
    return new org.eclipse.smarthome.automation.Rule(org.eclipse.smarthome.automation.sample.extension.java.WelcomeHomeRulesProvider.AC_UID, org.eclipse.smarthome.automation.sample.extension.java.template.AirConditionerRuleTemplate.UID, config);
}