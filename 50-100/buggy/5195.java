@java.lang.Override
public void add(cascading.tuple.Tuple tuple) {
    if ((tuple.size()) != (getDeclaredFields().size())) {
        throw new java.lang.IllegalArgumentException(((("Tuple size != declared fields size: " + tuple) + ", ") + (getDeclaredFields())));
    }
    collected.add(new cascading.tuple.TupleEntry(getDeclaredFields(), tuple));
}