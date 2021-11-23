private void didFindLine() {
    this.hal.stop();
    lejos.hardware.Sound.beepSequenceUp();
    this.sharedState.setState(State.LineSearch);
}