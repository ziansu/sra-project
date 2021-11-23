private it.polimi.tower4clouds.rules.MonitoringRules generateThirtySecondsRequestCountRule(eu.seaclouds.monitor.monitoringdamgenerator.adpparsing.Module module) {
    java.util.Map<java.lang.String, java.lang.String> parameters = new java.util.HashMap<java.lang.String, java.lang.String>();
    parameters.put("samplingTime", "10");
    return eu.seaclouds.monitor.monitoringdamgenerator.rulesgenerators.RuleSchemaGenerator.fillMonitoringRuleSchema("nuroThirtySecondsRequestCountRule", "30", "30", "InternalComponent", module.getModuleName(), "NUROServerLastTenSecondsRequestCount", parameters, "Sum", "InternalComponent", null, ("NUROServerLastThirtySecondsRequestCount_" + (module.getModuleName())));
}