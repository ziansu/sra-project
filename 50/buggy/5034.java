@java.lang.Override
public java.util.List<org.wso2.carbon.policy.mgt.common.monitor.ComplianceFeature> CheckPolicyCompliance(org.wso2.carbon.device.mgt.common.DeviceIdentifier deviceIdentifier, java.lang.Object deviceResponse) throws org.wso2.carbon.policy.mgt.common.monitor.PolicyComplianceException {
    return monitoringManager.checkPolicyCompliance(deviceIdentifier, deviceResponse);
}