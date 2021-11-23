private boolean runningHasNext() {
    return (this.runningBit) && ((this.runningLength) <= (this.position));
}