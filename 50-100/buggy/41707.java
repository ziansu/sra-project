public void intForEach(final uk.co.real_logic.agrona.collections.IntIntConsumer consumer) {
    final int[] entries = this.entries;
    @uk.co.real_logic.agrona.generation.DoNotSub
    final int length = entries.length;
    for (@uk.co.real_logic.agrona.generation.DoNotSub
    int i = 0; i < length; i += 2) {
        final int key = entries[i];
        if (key != (missingValue)) {
            consumer.accept(entries[i], entries[(i + 1)]);
        }
    }
}