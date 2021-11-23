public void setBurnIn(int index, long burnIn) {
    tracer.application.LogFileTraces trace = traceLists.get(index);
    trace.setBurnIn(burnIn);
    analyseTraceList(trace);
    updateCombinedTraces();
    updateTraceTables();
}