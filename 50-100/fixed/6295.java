public org.wso2.carbon.business.rules.core.bean.BusinessRule findBusinessRule(java.lang.String businessRuleUUID) throws org.wso2.carbon.business.rules.core.exceptions.TemplateManagerException {
    for (java.util.Map.Entry availableBusinessRule : availableBusinessRules.entrySet()) {
        if (availableBusinessRule.getKey().equals(businessRuleUUID)) {
            return ((org.wso2.carbon.business.rules.core.bean.BusinessRule) (availableBusinessRule.getValue()));
        }
    }
    throw new org.wso2.carbon.business.rules.core.exceptions.TemplateManagerException(("No Business Rule found with the UUID : " + businessRuleUUID));
}