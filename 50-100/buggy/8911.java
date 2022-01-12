@java.lang.Override
public T invertedCumulativeProbability(double cumulativeProbability) {
    com.google.common.base.Preconditions.checkArgument(((0 < cumulativeProbability) && (cumulativeProbability <= 1.0)));
    long card = domain.cardinality();
    long min = domain.ordinal(domain.min());
    long ordinal = ((long) (java.lang.Math.ceil((((cumulativeProbability * card) + min) - 1))));
    return domain.value(ordinal);
}