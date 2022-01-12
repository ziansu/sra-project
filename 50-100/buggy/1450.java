private void incrementUpdatedNodes_MT(calculation_john_pack.Observations o, boolean[] hidden, calculation_john_pack.ReducedConfiguration stats, int[] phenoOnSlice, int[] phenoOffSlice) {
    for (int x : phenoOnSlice) {
        stats.increment(getNodeCase(x, hidden, o));
    }
    for (int x : phenoOffSlice) {
        stats.increment(getNodeCase(x, hidden, o));
    }
}