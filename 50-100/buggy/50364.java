protected void progressCommandReceiverToNextTimeStep() {
    protopeer.time.Timer loadAgentTimer = getPeer().getClock().createNewTimer();
    loadAgentTimer.addTimerListener(new protopeer.time.TimerListener() {
        public void timerExpired(protopeer.time.Timer timer) {
            getCommandReceiver().progressToNextTimeStep();
        }
    });
    loadAgentTimer.schedule(this.runTime);
}