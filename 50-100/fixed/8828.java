public void receiveCommit() {
    this.state = "commit";
    logString("receivedCommit");
    readInput();
    try {
        java.lang.System.out.println(("aboutToSendAck:" + (this.state)));
        coordinator.receiveAck("commit", this.participantNum);
    } catch (java.lang.Exception e) {
        logString("coordinator.receiveAck('commit') Exception");
    }
}