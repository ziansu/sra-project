public void stop() {
    if ((pv) == null)
        return ;
    
    if ((connection_timeout_task) != null) {
        connection_timeout_task.cancel();
        connection_timeout_task = null;
    }
    if ((filter) != null)
        filter.stop();
    
    pv.removeListener(this);
    org.csstudio.vtype.pv.PVPool.releasePV(pv);
    pv = null;
    is_connected = false;
}