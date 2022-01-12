public boolean hasNext() {
    final int[] entries = this.entries;
    @uk.co.real_logic.agrona.generation.DoNotSub
    final int mask = (entries.length) - 1;
    boolean hasNext = false;
    for (@uk.co.real_logic.agrona.generation.DoNotSub
    int i = (positionCounter) - 2; i >= (stopCounter); i -= 2) {
        @uk.co.real_logic.agrona.generation.DoNotSub
        final int index = i & mask;
        if ((entries[index]) != (missingValue)) {
            hasNext = true;
            break;
        }
    }
    return hasNext;
}