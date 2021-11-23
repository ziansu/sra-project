public org.wso2.carbon.business.rules.core.bean.TemplateGroup findTemplateGroup(java.lang.String templateGroupName) throws org.wso2.carbon.business.rules.core.exceptions.TemplateManagerException {
    for (java.util.Map.Entry availableTemplateGroup : availableTemplateGroups.entrySet()) {
        if (availableTemplateGroup.getKey().toString().equals(templateGroupName)) {
            return ((org.wso2.carbon.business.rules.core.bean.TemplateGroup) (availableTemplateGroup.getValue()));
        }
    }
    throw new org.wso2.carbon.business.rules.core.exceptions.TemplateManagerException(("No Template Group found with the name : " + templateGroupName));
}