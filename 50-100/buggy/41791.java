@java.lang.Override
protected void collect(cascading.tuple.TupleEntry input) throws java.io.IOException {
    cascading.tuple.Tuple outgoing = outgoingBuilder.makeResult(incomingEntry.getTuple(), input.getTuple());
    outgoingEntry.setTuple(outgoing);
    try {
        next.receive(this, 0, outgoingEntry);
    } finally {
        cascading.tuple.Tuples.asModifiable(outgoing);
    }
}