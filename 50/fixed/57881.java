private void init() {
    restoreLastSession();
    org.dsa.iot.dslink.node.actions.Action act = setPathAction();
    node.createChild("Add Connection").setAction(act).setSerializable(false).build();
}