public void createPhilosopher(boolean hunger, boolean debugging, java.lang.String ip) throws java.rmi.RemoteException {
    shared.PhilosopherImpl phil = new shared.PhilosopherImpl(hunger, ip);
    phil.setTable(this);
    phil.setShowOutput(debugging);
    philosophers.add(phil);
    master.updatePhilosopher(phil, this);
    phil.setMaster(master);
    new java.lang.Thread(phil).start();
}