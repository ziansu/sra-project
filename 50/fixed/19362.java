private synchronized void fetchAll() {
    while (!(connection.getOutgoing().isEmpty()))
        doWorkSafe();
    
}