public void pauseAt(info.fulloo.trygve.run_time.RTCode code) {
    continueButton_.setEnabled(true);
    debuggerWindowMessage((("Paused at line " + (code.lineNumber())) + ". Stopped.\n"));
    this.stopCommon();
}