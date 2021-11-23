public boolean add(long value) {
    value = applyMode(value);
    if ((root) == null) {
        root = new zjava.collection.primitive.LongSet.Branch(((zjava.collection.primitive.LongSet.BITS_PER_WORD) - (zjava.collection.primitive.LongSet.BRANCH_RADIX)), value);
        (size)++;
        return true;
    }
    if (!(root.add(((zjava.collection.primitive.LongSet.BITS_PER_WORD) - (zjava.collection.primitive.LongSet.BRANCH_RADIX)), value)))
        return false;
    
    (size)++;
    return true;
}