public int minValue() {
    int min = ((size) == 0) ? missingValue : java.lang.Integer.MAX_VALUE;
    final int[] entries = this.entries;
    @uk.co.real_logic.agrona.generation.DoNotSub
    final int length = entries.length;
    for (@uk.co.real_logic.agrona.generation.DoNotSub
    int i = 1; i < length; i += 2) {
        final int value = entries[i];
        if (value != (missingValue)) {
            min = java.lang.Math.min(min, value);
        }
    }
    return min;
}