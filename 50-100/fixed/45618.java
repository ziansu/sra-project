public boolean containsAll(final org.agrona.collections.IntHashSet other) {
    final int missingValue = other.missingValue;
    for (final int value : other.values) {
        if ((value != missingValue) && (!(contains(value)))) {
            return false;
        }
    }
    return true;
}