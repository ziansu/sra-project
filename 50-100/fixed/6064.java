@java.lang.SuppressWarnings(value = "rawtypes")
@java.lang.Override
public void prepare(java.util.Map conf, backtype.storm.task.TopologyContext context) {
    this.componentInfo = new acromusashi.stream.hook.ComponentInfo(context.getThisComponentId(), context.getThisTaskId());
    int workerPort = context.getThisWorkerPort();
    int portAdjust = acromusashi.stream.hook.AmLogServerHook.DEFAULT_PORT_ADJUST;
    if (conf.containsKey("log.server.port.adjust")) {
        portAdjust = java.lang.Integer.parseInt(conf.get("log.server.port.adjust").toString());
    }
    int serverPort = workerPort + portAdjust;
    acromusashi.stream.hook.AmLogServerAdapter.getInstance().init(serverPort);
}