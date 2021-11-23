@java.lang.Override
public boolean isEnabled(java.lang.String username, java.lang.String actionId) {
    boolean returnValue = isBlacklist();
    java.util.Map<java.lang.String, sernet.verinice.model.auth.Action> actionMap = getUserActionMap().get(username);
    if (actionMap != null) {
        sernet.verinice.model.auth.Action action = actionMap.get(actionId);
        returnValue = ((action != null) && (isWhitelist())) || ((action == null) && (isBlacklist()));
    }
    return returnValue;
}