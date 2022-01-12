zjava.collection.primitive.LongSet.Node newEntry(int startingBit, long value) {
    return startingBit < (zjava.collection.primitive.LongSet.LEAF_RADIX) ? new zjava.collection.primitive.LongSet.Leaf(value) : new zjava.collection.primitive.LongSet.Branch(startingBit, value);
}