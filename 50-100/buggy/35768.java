private org.programmatori.domotica.own.plugin.system.Value getKernel() {
    java.lang.String kernel = null;
    try {
        kernel = org.programmatori.domotica.own.sdk.config.Config.getInstance().getNode("system.kernel");
    } catch (java.lang.Exception e) {
    }
    if (kernel == null) {
        kernel = "0.0.0";
    }
    org.programmatori.domotica.own.plugin.system.Value v = devideString(kernel, '.');
    return v;
}