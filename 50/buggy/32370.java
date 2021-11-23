public long subtractTime(long time) {
    this.time -= time;
    this.changed = true;
    return this.time;
}