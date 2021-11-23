protected java.lang.Object getDialogState(java.lang.String name) {
    java.lang.Object object = amosalexa.SessionStorage.getInstance().getObject(amosalexa.services.financing.AffordabilityService.session.getSessionId(), name);
    amosalexa.SessionStorage.getInstance().putObject(amosalexa.services.financing.AffordabilityService.session.getSessionId(), name, null);
    return object;
}