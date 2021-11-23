public synchronized void processMasterComputationalMessage(pt.ulisboa.tecnico.hourglass.slave.MasterComputationalMessage masterComputationalMessage) {
    this.incrementalComputationTerminated = masterComputationalMessage.isLastSuperstep();
    this.receivedMasterComputationalMessage = true;
    this.notify();
}