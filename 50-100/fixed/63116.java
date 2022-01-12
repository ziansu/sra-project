private void changeReplica() {
    int[] processes = this.SVController.getCurrentViewOtherAcceptors();
    java.util.Random r = new java.util.Random();
    int pos;
    do {
        if ((processes != null) && ((processes.length) > 1)) {
            pos = r.nextInt(processes.length);
            replica = processes[pos];
        }else {
            replica = 0;
            break;
        }
    } while ((replica) == (bftsmart.statemanagement.strategy.SVController.getStaticConf().getProcessId()) );
}