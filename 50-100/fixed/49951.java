@java.lang.Override
public void undeploy(java.lang.String fileName) throws org.apache.axis2.deployment.DeploymentException {
    java.lang.String platformId = org.wso2.carbon.device.application.mgt.core.deployer.PlatformDeployer.getPlatformID(fileName);
    try {
        org.wso2.carbon.device.application.mgt.core.internal.DataHolder.getInstance().getPlatformManager().unregister(org.wso2.carbon.context.CarbonContext.getThreadLocalCarbonContext().getTenantId(), platformId, true);
        org.wso2.carbon.device.application.mgt.core.deployer.PlatformDeployer.log.info((("Platform configuration : " + fileName) + " un-deployed successfully"));
    } catch (org.wso2.carbon.device.application.mgt.common.exception.PlatformManagementException e) {
        org.wso2.carbon.device.application.mgt.core.deployer.PlatformDeployer.log.error(("Error occurred while un-deploying the platform - " + fileName), e);
    }
}