public boolean containsAll(final org.agrona.collections.IntHashSet other) {
    java.util.Objects.requireNonNull(other);
    final int missingValue = other.missingValue;
    for (final int value : other.values) {
        if ((value != missingValue) && (!(contains(value)))) {
            return false;
        }
    }
    return true;
}