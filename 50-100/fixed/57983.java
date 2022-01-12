private org.apache.camel.CamelContext getOrMakeContextByRid(java.lang.String rid) {
    org.apache.camel.CamelContext context;
    java.util.Map<java.lang.String, org.apache.camel.CamelContext> contextMap = getApplication().getMetaData(org.orienteer.camel.widget.CamelWidget.INTEGRATION_SESSIONS_KEY);
    if (contextMap.containsKey(rid)) {
        context = contextMap.get(rid);
    }else {
        context = new org.apache.camel.impl.DefaultCamelContext();
        context.getManagementStrategy().addEventNotifier(new org.orienteer.camel.component.CamelEventHandler(""));
        contextMap.put(rid, context);
    }
    return context;
}