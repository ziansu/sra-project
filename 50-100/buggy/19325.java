public void run(java.lang.String[] args) throws java.lang.Exception {
    long tStart = java.lang.System.currentTimeMillis();
    skadistats.clarity.processor.runner.AbstractRunner<skadistats.clarity.processor.runner.SimpleRunner> r = new skadistats.clarity.processor.runner.SimpleRunner(new skadistats.clarity.source.InputStreamSource(java.lang.System.in)).runWith(this);
    summary(r.getContext());
    long tMatch = (java.lang.System.currentTimeMillis()) - tStart;
    log.info("total time taken: {}s", (tMatch / 1000.0));
}