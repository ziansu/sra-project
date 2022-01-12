void promoteLowToMediumOnWait() {
    if (((this.lowTick) % 5) == 0) {
        labs.one.util.Job j = this.low.shift();
        if (j != null) {
            this.medium.push(j);
        }
    }
    (this.lowTick)++;
}