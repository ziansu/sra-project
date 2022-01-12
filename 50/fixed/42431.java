private boolean determineExecuteAsUser(azkaban.utils.Props sysProps, azkaban.utils.Props jobProps) {
    return sysProps.getBoolean(azkaban.jobExecutor.ProcessJob.EXECUTE_AS_USER, false);
}