public com.bishabosha.caffeine.datatypes.Sequence<T>.SequenceBuilder reset() {
    sequence = getEmptyList();
    termsLeft = terms;
    n = 0;
    return this;
}