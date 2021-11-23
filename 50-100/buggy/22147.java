@java.lang.Override
public void merge(long count, java.lang.Long sum, java.lang.Long min, java.lang.Long max) {
    this.count += count;
    if (sum != null) {
        this.sum += sum;
    }
    if (min != null) {
        evaluateMinMax(min);
    }
    if (max != null) {
        evaluateMinMax(max);
    }
}