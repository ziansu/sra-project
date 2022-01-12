public static java.lang.String protectAction(java.lang.String originAction) {
    if (originAction.startsWith("_VA_")) {
        return originAction;
    }
    java.lang.String newAction = com.lody.virtual.client.env.SpecialComponentList.PROTECTED_ACTION_MAP.get(originAction);
    if (newAction == null) {
        newAction = (com.lody.virtual.client.env.SpecialComponentList.PROTECT_ACTION_PREFIX) + originAction;
    }
    return newAction;
}