public int maxValue() {
    final int missingValue = this.missingValue;
    int max = ((size) == 0) ? missingValue : java.lang.Integer.MIN_VALUE;
    final int[] entries = this.entries;
    @uk.co.real_logic.agrona.generation.DoNotSub
    final int length = entries.length;
    for (@uk.co.real_logic.agrona.generation.DoNotSub
    int i = 1; i < length; i += 2) {
        final int value = entries[i];
        if (value != missingValue) {
            max = java.lang.Math.max(max, value);
        }
    }
    return max;
}