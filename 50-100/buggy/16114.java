public java.lang.String requestMove(java.lang.String moveType) {
    long startTime = java.lang.System.currentTimeMillis();
    sendLine(java.lang.String.format("action %s %d", moveType, this.timeBank));
    java.lang.String response = ioPlayer.getResponse(this.timeBank);
    long timeElapsed = (java.lang.System.currentTimeMillis()) - startTime;
    updateTimeBank(timeElapsed);
    return response;
}