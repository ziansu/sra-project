@java.lang.Override
public boolean tryAdvance(java.util.function.IntConsumer action) {
    if (((startOuterInclusive) >= (endOuterExclusive)) || ((startInnerInclusive) >= (endInnerExclusive))) {
        return false;
    }
    action.accept(array[startOuterInclusive][startInnerInclusive]);
    ++(startInnerInclusive);
    if ((startInnerInclusive) >= (endInnerExclusive)) {
        ++(startOuterInclusive);
    }
    return true;
}