public void reportState(int id) {
    logToScreen("Report state ...");
    node.setMaster(id);
    util.Message stateReport = new util.Message(util.Constants.STATE_REP, "", "", node.state.name());
    node.unicast(node.getMaster(), stateReport);
}