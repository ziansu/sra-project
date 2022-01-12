public org.smartdata.common.actions.ActionInfo getActionInfo(long actionID) throws java.io.IOException {
    org.smartdata.actions.SmartAction smartAction = actionPool.get(actionID);
    if (smartAction != null) {
        return createActionInfoFromAction(smartAction, 0);
    }
    org.smartdata.common.actions.ActionInfo actioninfo;
    try {
        actioninfo = adapter.getActionsTableItem(java.lang.String.format("== %d ", actionID), null).get(0);
    } catch (java.sql.SQLException e) {
        org.smartdata.server.command.CommandExecutor.LOG.error("Get ActionInfo of {} from DB error! {}", actionID, e);
        throw new java.io.IOException(e);
    }
    return actioninfo;
}