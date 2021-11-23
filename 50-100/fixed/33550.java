public org.agrona.collections.IntHashSet difference(final org.agrona.collections.IntHashSet other) {
    org.agrona.collections.IntHashSet difference = null;
    final int missingValue = this.missingValue;
    for (final int value : values) {
        if ((value != missingValue) && (!(other.contains(value)))) {
            if (difference == null) {
                difference = new org.agrona.collections.IntHashSet(size, missingValue);
            }
            difference.add(value);
        }
    }
    return difference;
}