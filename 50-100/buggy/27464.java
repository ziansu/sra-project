public static final <K, C extends it.unimi.dsi.fastutil.ints.IntSortedSet> void incrementValues(final it.unimi.dsi.fastutil.objects.Object2IntMap<K> map, final java.util.Collection<? extends K> keysToIncrement, final int increment, final int fromValue, final int toValue) {
    assert keysToIncrement != null;
    final it.unimi.dsi.fastutil.ints.IntCollection incrementedValues = new it.unimi.dsi.fastutil.ints.IntOpenHashSet(keysToIncrement.size());
    for (final K keyToIncrement : keysToIncrement) {
        com.github.errantlinguist.fastutil.ints.Object2IntMapValueArithmetic.incrementValues(map, keyToIncrement, increment, fromValue, toValue, incrementedValues);
    }
}