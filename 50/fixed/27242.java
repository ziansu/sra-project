public void beginShutDown(boolean pRestart) {
    sharedSettings.beginShutDown = true;
    sharedSettings.restartProgram = pRestart;
}