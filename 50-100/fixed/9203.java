private java.util.List<org.smartdata.common.actions.ActionInfo> getActionInfoFromCommand(long cid) throws java.io.IOException {
    java.util.ArrayList<org.smartdata.common.actions.ActionInfo> actionInfos = new java.util.ArrayList<>();
    org.smartdata.server.command.Command cmd = commandPool.getCommand(cid);
    if (cmd == null) {
        return actionInfos;
    }
    for (org.smartdata.actions.SmartAction smartAction : cmd.getActions()) {
        actionInfos.add(createActionInfoFromAction(smartAction, cid));
    }
    return actionInfos;
}