com.mongodb.ReplicaSetStatus.Node ensureMaster() {
    com.mongodb.ReplicaSetStatus.Node n = getMasterNode();
    if (n != null) {
        n.update();
        if (n._isMaster)
            return n;
        
    }
    if ((_lastPrimarySignal.get()) != null) {
        n = findNode(_lastPrimarySignal.get());
        if (n != null) {
            n.update();
            if (n._isMaster)
                return n;
            
        }
    }
    updateAll();
    return getMasterNode();
}