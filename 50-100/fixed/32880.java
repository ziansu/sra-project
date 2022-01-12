@java.lang.Override
public java.util.List<org.wso2.carbon.policy.mgt.common.Policy> filterDeviceTypeBasedPolicies(java.lang.String deviceType, java.util.List<org.wso2.carbon.policy.mgt.common.Policy> policies) {
    java.util.List<org.wso2.carbon.policy.mgt.common.Policy> temp = new java.util.ArrayList<org.wso2.carbon.policy.mgt.common.Policy>();
    for (org.wso2.carbon.policy.mgt.common.Policy policy : policies) {
        if (deviceType.equalsIgnoreCase(policy.getProfile().getDeviceType().getName())) {
            temp.add(policy);
        }
    }
    return temp;
}