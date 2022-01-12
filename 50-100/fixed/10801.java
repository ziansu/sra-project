@java.lang.Override
public boolean hasTop() {
    return ((numRejects) != (-1)) && (((((numRejects) >= (edu.mit.ll.graphulo.skvi.RemoteWriteIterator.REJECT_FAILURE_THRESHOLD)) || (rowRangeIterator.hasNext())) || ((entriesWritten) > 0)) || (reducer.hasTopForClient()));
}