private int incrementUpdatedNodes_MT(calculation_john_pack.Observations o, boolean[] hidden, calculation_john_pack.ReducedConfiguration stats, int[] phenoOnSlice, int[] phenoOffSlice) {
    int counter = 0;
    for (int x : phenoOnSlice) {
        stats.increment(getNodeCase(x, hidden, o));
        counter++;
    }
    for (int x : phenoOffSlice) {
        stats.increment(getNodeCase(x, hidden, o));
        counter++;
    }
    return counter;
}