public long subtractTime(long time) {
    if ((this.time) != (-1L)) {
        this.time -= time;
        this.changed = true;
    }
    return this.time;
}