@java.lang.Override
public boolean tryAdvance(java.util.function.IntConsumer action) {
    if ((startOuterInclusive) >= (endOuterExclusive)) {
        return false;
    }
    if ((startInnerInclusive) >= (endInnerExclusive)) {
        ++(startOuterInclusive);
        if ((startOuterInclusive) >= (endOuterExclusive)) {
            return false;
        }
        startInnerInclusive = 0;
        endInnerExclusive = array[startOuterInclusive].length;
    }
    action.accept(array[startOuterInclusive][startInnerInclusive]);
    ++(startInnerInclusive);
    return true;
}