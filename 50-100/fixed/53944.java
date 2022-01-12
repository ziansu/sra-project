public void setTuple(cascading.tuple.Tuple tuple) {
    if (((!(isUnmodifiable)) && (tuple != null)) && (tuple.isUnmodifiable()))
        throw new java.lang.IllegalArgumentException("current entry is modifiable but given tuple is not modifiable, make copy of given Tuple first");
    
    if ((tuple != null) && (isUnmodifiable))
        this.tuple = cascading.tuple.Tuples.asUnmodifiable(tuple);
    else
        this.tuple = tuple;
    
    setCoercions();
}