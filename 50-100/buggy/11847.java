@java.lang.Override
void restoreLastSession() {
    init();
    java.util.Set<modbus.SlaveNode> slavescopy = new java.util.HashSet<modbus.SlaveNode>(slaves);
    slaves.clear();
    for (modbus.SlaveNode sn : slavescopy) {
        if ((sn.node) != (node)) {
            addSlave(sn.node);
        }
    }
}