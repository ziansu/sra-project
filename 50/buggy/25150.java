public heronarts.lx.modulator.Click stopAndReset() {
    this.stop();
    this.elapsedMs = 0;
    this.setBasis(0);
    return this;
}