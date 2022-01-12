private org.programmatori.domotica.own.plugin.system.Value getModel() {
    java.lang.String model = null;
    try {
        model = org.programmatori.domotica.own.sdk.config.Config.getInstance().getNode("system.model");
    } catch (java.lang.Exception e) {
    }
    if (model == null) {
        model = "99";
    }
    return new org.programmatori.domotica.own.plugin.system.Value(model);
}