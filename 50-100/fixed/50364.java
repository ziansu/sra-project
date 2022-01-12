private void progressCommandReceiverToNextTimeStep() {
    protopeer.time.Timer loadAgentTimer = getPeer().getClock().createNewTimer();
    loadAgentTimer.addTimerListener(new protopeer.time.TimerListener() {
        public void timerExpired(protopeer.time.Timer timer) {
            getCommandReceiver().progressToNextTimeStep();
            progressCommandReceiverToNextTimeStep();
        }
    });
    loadAgentTimer.schedule(this.runTime);
}