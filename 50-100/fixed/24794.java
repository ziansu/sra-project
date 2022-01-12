private void maybeResetHistogram() {
    voldemort.store.stats.RequestCounter.Accumulator accum = values.get();
    long now = time.getMilliseconds();
    if ((now - (accum.startTimeMS)) > (durationMS)) {
        q95LatencyMs = histogram.getQuantile(0.95);
        q99LatencyMs = histogram.getQuantile(0.99);
        histogram.reset();
    }
}