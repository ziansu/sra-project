@java.lang.Override
public org.backmeup.plugin.api.connectors.Action getAction(java.lang.String actionId) {
    return service(org.backmeup.plugin.api.connectors.Action.class, (("(name=" + actionId) + ")"));
}