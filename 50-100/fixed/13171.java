public void receiveAbort() {
    this.state = "abort";
    logString("receivedAbort");
    readInput();
    try {
        java.lang.System.out.println(("aboutToSendAck:" + (this.state)));
        coordinator.receiveAck("abort", this.participantNum);
    } catch (java.lang.Exception e) {
        logString("coordinator.receiveAck('abort') Exception");
    }
}