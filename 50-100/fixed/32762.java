@java.lang.Override
public boolean isRunnable(final com.nike.cerberus.command.gateway.CreateGatewayConfigCommand command) {
    boolean isRunnable = true;
    final java.lang.String cmsStackId = configStore.getStackId(StackName.CMS);
    if (org.apache.commons.lang3.StringUtils.isBlank(cmsStackId)) {
        logger.error("No CMS stack present for the specified environment, please create that first.");
        isRunnable = false;
    }
    return isRunnable;
}