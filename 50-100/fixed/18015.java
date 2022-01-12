private void rehash(@uk.co.real_logic.agrona.generation.DoNotSub
final int newCapacity) {
    final int[] oldEntries = entries;
    final int missingValue = this.missingValue;
    @uk.co.real_logic.agrona.generation.DoNotSub
    final int length = entries.length;
    capacity(newCapacity);
    for (@uk.co.real_logic.agrona.generation.DoNotSub
    int i = 0; i < length; i += 2) {
        final int key = oldEntries[i];
        if (key != missingValue) {
            put(key, oldEntries[(i + 1)]);
        }
    }
}