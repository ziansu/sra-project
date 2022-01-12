public static void init(final int measurements, final java.lang.String[] events, int... options) {
    if ((cz.cuni.mff.d3s.perf.Benchmark.defaultEventSet) != (-1)) {
        cz.cuni.mff.d3s.perf.Measurement.destroyEventSet(cz.cuni.mff.d3s.perf.Benchmark.defaultEventSet);
        cz.cuni.mff.d3s.perf.Benchmark.defaultEventSet = -1;
    }
    cz.cuni.mff.d3s.perf.Benchmark.defaultEventSet = cz.cuni.mff.d3s.perf.Measurement.createEventSet(measurements, events, options);
}