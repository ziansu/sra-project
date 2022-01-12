public boolean remove(final int value) {
    @uk.co.real_logic.agrona.generation.DoNotSub
    int index = uk.co.real_logic.agrona.collections.Hashing.intHash(value, mask);
    while ((values[index]) != (missingValue)) {
        if ((values[index]) == value) {
            values[index] = missingValue;
            compactChain(index);
            (size)--;
            return true;
        }
        index = next(index);
    } 
    return false;
}