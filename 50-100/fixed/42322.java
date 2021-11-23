@java.lang.Override
public boolean executeCommand() {
    if ((isClosed()) && ((idx) == 0))
        idx = (nodes.size()) - 1;
    
    sn = nodes.get(idx);
    wasDeleted = sn.node.isDeleted();
    if (deleteUnderlying()) {
        sn.node.setDeleted(true);
        affected = true;
    }
    nodes.remove(idx);
    return true;
}