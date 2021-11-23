@java.lang.Override
public void merge(long count, java.math.BigInteger sum, java.math.BigInteger min, java.math.BigInteger max) {
    if (min != null) {
        evaluateMinMax(min);
    }
    this.count += count;
    if (max != null) {
        evaluateMinMax(max);
    }
    this.sum = this.sum.add(sum);
}