private void updateSkipInterval(org.apache.pig.data.Tuple t) {
    avgTupleMemSz = (((avgTupleMemSz) * (numRowsSampled)) + (t.getMemorySize())) / ((numRowsSampled) + 1);
    skipInterval = (memToSkipPerSample) / (avgTupleMemSz);
    if ((numRowsSampled) < 5) {
        skipInterval = (skipInterval) / (10 - (numRowsSampled));
    }
    ++(numRowsSampled);
}