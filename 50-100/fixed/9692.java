public static void filterAdminOnlyFlowParams(azkaban.user.UserManager userManager, azkaban.executor.ExecutionOptions options, azkaban.user.User user) throws azkaban.executor.ExecutorManagerException {
    if ((options == null) || ((options.getFlowParameters()) == null))
        return ;
    
    java.util.Map<java.lang.String, java.lang.String> params = options.getFlowParameters();
    if (!(azkaban.server.HttpRequestUtils.hasPermission(userManager, user, Type.ADMIN))) {
        params.remove(ExecutionOptions.FLOW_PRIORITY);
    }else {
        azkaban.server.HttpRequestUtils.validateIntegerParam(params, ExecutionOptions.FLOW_PRIORITY);
    }
}