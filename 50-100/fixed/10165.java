public static org.jboss.reddeer.common.context.ExecutionSetting getInstance() {
    if ((org.jboss.reddeer.common.context.ExecutionSetting.instance) == null) {
        org.jboss.reddeer.common.context.ExecutionSetting.instance = new org.jboss.reddeer.common.context.ExecutionSetting();
        org.jboss.reddeer.common.context.ExecutionSetting.instance.pauseFailedTest = RedDeerProperties.PAUSE_FAILED_TEST.getBooleanSystemValue();
        java.lang.String logMessageFilterText = RedDeerProperties.LOG_MESSAGE_FILTER.getSystemValue();
        java.lang.String logLevel = RedDeerProperties.LOG_LEVEL.getSystemValue();
        org.jboss.reddeer.common.context.ExecutionSetting.instance.logLevel = LogLevel.ALL.fromString(logLevel).getValue();
        org.jboss.reddeer.common.context.ExecutionSetting.instance.parseLogMessageFilter(logMessageFilterText);
    }
    return org.jboss.reddeer.common.context.ExecutionSetting.instance;
}