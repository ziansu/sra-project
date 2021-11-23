@java.lang.Override
public void merge(long count, java.math.BigInteger sum, java.math.BigInteger min, java.math.BigInteger max) {
    this.count += count;
    if (sum != null) {
        this.sum = this.sum.add(sum);
    }
    if (min != null) {
        evaluateMinMax(min);
    }
    if (max != null) {
        evaluateMinMax(max);
    }
}