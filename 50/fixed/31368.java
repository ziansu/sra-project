public double getAvgChangesPS() {
    if (!(changesComputed)) {
        computeChanges();
    }
    return (avgChangesPS) / ((loadingTimes.size()) - 1);
}