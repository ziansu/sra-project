public void resetElectionTimeOut() {
    this.timerValue = (io.netty.util.internal.ThreadLocalRandom.current().nextLong(minRandom, ((maxRandom) + 1))) * 1000;
    electionTimeOut = (java.lang.System.currentTimeMillis()) + (this.timerValue);
    gash.router.server.states.ElectionTimer.logger.info(("Election will start in millisecs:  " + ((electionTimeOut) - (java.lang.System.currentTimeMillis()))));
}