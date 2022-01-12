private org.programmatori.domotica.own.plugin.system.Value getVersion() {
    java.lang.String firmware = null;
    try {
        firmware = org.programmatori.domotica.own.sdk.config.Config.getInstance().getNode("system.version");
    } catch (java.lang.Exception e) {
    }
    if (firmware == null) {
        firmware = org.programmatori.domotica.own.sdk.config.Config.SERVER_VERSION;
    }
    org.programmatori.domotica.own.plugin.system.Value v = devideString(firmware, '.');
    return v;
}