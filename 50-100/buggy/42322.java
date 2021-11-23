@java.lang.Override
public boolean executeCommand() {
    if ((isClosed()) && ((idx) == 0))
        idx = (nodes.size()) - 1;
    
    sn = nodes.get(idx);
    wasDeleted = sn.node.isDeleted();
    nodes.remove(idx);
    if (deleteUnderlying()) {
        sn.node.setDeleted(true);
        affected = true;
    }
    return true;
}