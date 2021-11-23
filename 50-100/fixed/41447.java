@java.lang.Override
public void merge(long count, java.math.BigInteger sum, java.math.BigInteger min, java.math.BigInteger max) {
    if (min != null) {
        evaluateMinMax(min);
    }
    if (max != null) {
        evaluateMinMax(max);
    }
    this.count += count;
    this.sum = this.sum.add(sum);
}