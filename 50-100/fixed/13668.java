public void receivePrepare() {
    this.state = "ready";
    logString("receivedPrepare");
    java.lang.String vote = readVoteInput();
    try {
        java.lang.System.out.println(("aboutToSendVote:" + vote));
        coordinator.receiveVote(vote, this.participantNum);
        return ;
    } catch (java.lang.Exception e) {
        logString("receiveVote('commit') Exception");
        lookupCoordinator();
    }
}