private void changeReplica() {
    int[] processes = this.SVController.getCurrentViewOtherAcceptors();
    java.util.Random r = new java.util.Random();
    int pos;
    do {
        pos = r.nextInt(processes.length);
        replica = processes[pos];
    } while ((replica) == (bftsmart.statemanagement.strategy.SVController.getStaticConf().getProcessId()) );
}