@java.lang.Override
protected void logger(net.vicp.lylab.core.model.Message request, net.vicp.lylab.core.model.Message response) {
    ((net.vicp.lylab.server.utils.Logger) (CoreDef.config.getConfig("Singleton").getObject("Logger"))).appendLine(((((("Access key:" + (request.getKey())) + "\nBefore:") + request) + "\nAfter:") + response));
}