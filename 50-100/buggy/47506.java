public java.lang.Object getObject() throws java.lang.Exception {
    if ("prototype".equalsIgnoreCase(scope)) {
        helper.setKieBase(kBase);
        kSession = helper.internalNewObject();
        attachLoggers(((org.kie.api.event.KieRuntimeEventManager) (kSession)));
        attachListeners(((org.kie.api.event.KieRuntimeEventManager) (kSession)));
        return kSession;
    }
    return helper.internalGetObject();
}