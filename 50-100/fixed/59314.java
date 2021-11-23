@java.lang.Override
protected void collect(cascading.tuple.TupleEntry tupleEntry) throws java.io.IOException {
    if (!(tupleEntry.getFields().equals(getDeclaredFields()))) {
        throw new java.lang.IllegalArgumentException(((("Collected fields != declared fields: " + (tupleEntry.getFields())) + ", ") + (getDeclaredFields())));
    }
    collected.add(new cascading.tuple.TupleEntry(tupleEntry));
}