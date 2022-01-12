public org.apache.drill.exec.physical.impl.xsort.managed.SortImpl.SortResults startMerge() {
    if ((metrics.getInputRowCount()) == 0) {
        return new org.apache.drill.exec.physical.impl.xsort.managed.SortImpl.EmptyResults(outputBatch);
    }
    org.apache.drill.exec.physical.impl.xsort.managed.SortImpl.logger.debug("Completed load phase: read {} batches, spilled {} times, total input bytes: {}", metrics.getInputBatchCount(), spilledRuns.size(), metrics.getInputBytes());
    if (canUseMemoryMerge()) {
        return mergeInMemory();
    }else {
        return mergeSpilledRuns();
    }
}