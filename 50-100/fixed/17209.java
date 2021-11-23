@java.lang.Override
public void merge(long count, java.lang.Long sum, java.lang.Long min, java.lang.Long max) {
    if (min != null) {
        evaluateMinMax(min);
    }
    this.count += count;
    if (max != null) {
        evaluateMinMax(max);
    }
    if (sum != null) {
        this.sum += sum;
    }
}