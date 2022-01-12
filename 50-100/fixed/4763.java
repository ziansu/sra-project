@java.lang.Override
public java.util.List<org.wso2.carbon.policy.mgt.common.Policy> filterOwnershipTypeBasedPolicies(java.lang.String ownershipType, java.util.List<org.wso2.carbon.policy.mgt.common.Policy> policies) {
    java.util.List<org.wso2.carbon.policy.mgt.common.Policy> temp = new java.util.ArrayList<org.wso2.carbon.policy.mgt.common.Policy>();
    for (org.wso2.carbon.policy.mgt.common.Policy policy : policies) {
        if ((ownershipType.equalsIgnoreCase(policy.getOwnershipType())) || (PolicyManagementConstants.ANY.equalsIgnoreCase(policy.getOwnershipType()))) {
            temp.add(policy);
        }
    }
    return temp;
}