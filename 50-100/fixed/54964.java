public void setVariables(java.util.Map<java.lang.String, java.lang.Object> varList) {
    variables.clearVars();
    for (java.lang.String key : varList.keySet()) {
        java.lang.System.out.print(("Adding variable - " + key));
        variables.addVar(key, varList.get(key));
    }
    flagAsChanged();
    if (org.anjocaido.groupmanager.GroupManager.isLoaded()) {
        org.anjocaido.groupmanager.events.GroupManagerEventHandler.callEvent(this, Action.USER_INFO_CHANGED);
    }
}