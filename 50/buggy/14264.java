public heronarts.lx.modulator.LXModulator fire() {
    this.elapsedMs = 0;
    setValue(1);
    start();
    return this;
}