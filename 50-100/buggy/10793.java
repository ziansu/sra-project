public static void releaseBatches(org.apache.drill.exec.record.RecordBatch incoming) {
    if (incoming instanceof org.apache.drill.exec.physical.impl.validate.IteratorValidatorBatchIterator) {
        incoming = ((org.apache.drill.exec.physical.impl.validate.IteratorValidatorBatchIterator) (incoming)).getIncoming();
    }
    if (incoming instanceof org.apache.drill.exec.physical.impl.xsort.managed.ExternalSortBatch) {
        org.apache.drill.exec.physical.impl.xsort.managed.ExternalSortBatch esb = ((org.apache.drill.exec.physical.impl.xsort.managed.ExternalSortBatch) (incoming));
        assert (esb.sortState) == (org.apache.drill.exec.physical.impl.xsort.managed.ExternalSortBatch.SortState.DONE);
        if ((esb.resultsIterator) != null) {
            esb.resultsIterator.close();
            esb.resultsIterator = null;
        }
    }
}