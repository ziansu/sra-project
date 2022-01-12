@org.testng.annotations.Test(dependsOnMethods = "getEffectivePolicy")
public void updatePriorities() throws org.wso2.carbon.ntask.common.TaskException, org.wso2.carbon.policy.mgt.core.PolicyManagementException {
    org.wso2.carbon.policy.mgt.core.PolicyManagerService policyManagerService = new org.wso2.carbon.policy.mgt.core.PolicyManagerServiceImpl();
    org.wso2.carbon.policy.mgt.core.PolicyAdministratorPoint administratorPoint = policyManagerService.getPAP();
    java.util.List<org.wso2.carbon.policy.mgt.core.Policy> policies = administratorPoint.getPolicies();
    org.wso2.carbon.policy.mgt.core.PolicyEvaluationTestCase.log.debug("Re-enforcing policy started...!");
    int size = policies.size();
    sortPolicies(policies);
    int x = 0;
    for (org.wso2.carbon.policy.mgt.core.Policy policy : policies) {
        policy.setPriorityId((size - x));
        x++;
    }
    administratorPoint.updatePolicyPriorities(policies);
}