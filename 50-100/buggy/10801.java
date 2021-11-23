@java.lang.Override
public boolean hasTop() {
    java.lang.System.out.println((((((thisInst) + " hasTop(): entriesWritten==") + (entriesWritten)) + " rowRangeIterator.hasNext()==") + (rowRangeIterator.hasNext())));
    return ((numRejects) != (-1)) && (((((numRejects) >= (edu.mit.ll.graphulo.skvi.RemoteWriteIterator.REJECT_FAILURE_THRESHOLD)) || (rowRangeIterator.hasNext())) || ((entriesWritten) > 0)) || (reducer.hasTopForClient()));
}