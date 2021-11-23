public void reportState(int id) {
    logToScreen("Report state ...");
    if ((node.state) == (TPCNode.SlaveState.READY)) {
        node.state = TPCNode.SlaveState.ABORTED;
    }
    node.setMaster(id);
    util.Message stateReport = new util.Message(util.Constants.STATE_REP, "", "", node.state.name());
    node.unicast(node.getMaster(), stateReport);
}