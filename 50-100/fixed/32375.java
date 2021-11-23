@java.lang.Override
protected com.up.sim.model.LogModel request0() {
    java.lang.String requestLog = logRequest(request);
    try {
        java.lang.String responseLog = client.execute(request, new com.up.sim.handler.RespLoggingHandler(request, model));
        return com.up.sim.model.LogModel.newInstance(model.getBussId(), requestLog, responseLog, RequestStatusCode.REQUEST_SUCCESS);
    } catch (java.lang.Exception e) {
        com.up.sim.client.SimHttpClient.logger.error("发送请求失败", e);
        return com.up.sim.model.LogModel.newInstance(model.getBussId(), requestLog, com.google.common.base.Throwables.getStackTraceAsString(e), RequestStatusCode.REQUEST_FAILURE);
    }
}