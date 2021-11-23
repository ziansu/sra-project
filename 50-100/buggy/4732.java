@java.lang.Override
public void generateEntitlementPolicies(org.wso2.carbon.appmgt.api.model.APIIdentifier apiIdentifier, java.lang.String authorizedAdminCookie) throws org.wso2.carbon.appmgt.api.AppManagementException {
    org.wso2.carbon.appmgt.impl.AppManagerConfiguration config = org.wso2.carbon.appmgt.impl.service.ServiceReferenceHolder.getInstance().getAPIManagerConfigurationService().getAPIManagerConfiguration();
    java.util.List<org.wso2.carbon.appmgt.api.model.entitlement.XACMLPolicyTemplateContext> xacmlPolicyTemplateContexts = appMDAO.getEntitlementPolicyTemplateContexts(apiIdentifier);
    org.wso2.carbon.appmgt.api.EntitlementService entitlementService = org.wso2.carbon.appmgt.impl.entitlement.EntitlementServiceFactory.getEntitlementService(config, authorizedAdminCookie);
    entitlementService.generateAndSaveEntitlementPolicies(xacmlPolicyTemplateContexts);
    appMDAO.updateURLEntitlementPolicyPartialMappings(xacmlPolicyTemplateContexts);
}