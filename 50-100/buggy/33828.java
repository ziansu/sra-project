public static void validateTemplateGroup(org.wso2.carbon.business.rules.core.internal.bean.TemplateGroup templateGroup) throws org.wso2.carbon.business.rules.core.internal.exceptions.TemplateManagerException {
    try {
        if ((templateGroup.getName()) == null) {
            throw new org.wso2.carbon.business.rules.core.internal.exceptions.TemplateManagerException("Invalid TemplateGroup configuration file found");
        }
        if (!((templateGroup.getRuleTemplates().size()) > 0)) {
            throw new org.wso2.carbon.business.rules.core.internal.exceptions.TemplateManagerException("Invalid TemplateGroup configuration file found");
        }
        for (org.wso2.carbon.business.rules.core.internal.bean.RuleTemplate ruleTemplate : templateGroup.getRuleTemplates()) {
            org.wso2.carbon.business.rules.core.internal.util.TemplateManagerHelper.validateRuleTemplate(ruleTemplate);
        }
    } catch (org.wso2.carbon.business.rules.core.internal.exceptions.TemplateManagerException x) {
        java.lang.System.out.println("TemplateGroup Not Valid");
    }
}