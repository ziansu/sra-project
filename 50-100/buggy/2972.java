@java.lang.Override
public java.util.Spliterator.OfInt trySplit() {
    final int length = (endOuterExclusive) - (startOuterInclusive);
    if (length < 2) {
        return tryInnerSplit();
    }
    final int middle = (startOuterInclusive) + (length / 2);
    spliterators.part1.exercise.RectangleSpliterator result = new spliterators.part1.exercise.RectangleSpliterator(array, startOuterInclusive, middle, startInnerInclusive, endInnerExclusive);
    startOuterInclusive = middle;
    return result;
}