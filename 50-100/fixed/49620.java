public void setBeginCount(double count, boolean recompute) {
    if ((count < (this.endCount)) || (!recompute)) {
        this.beginCount = count;
    }
    if (recompute) {
        this.recompute();
    }
    redrawCounts();
}