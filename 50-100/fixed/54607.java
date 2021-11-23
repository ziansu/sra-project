public void setEndCount(double count, boolean recompute) {
    if ((count > (this.beginCount)) || (!recompute)) {
        this.endCount = count;
    }
    if (recompute) {
        this.recompute();
    }
    redrawCounts();
}