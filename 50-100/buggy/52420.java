public T nextValue() {
    int idx = this.inner.nextInt(histogram.getSampleCount());
    java.lang.Long total = this.value_rle.tailMap(((long) (idx))).firstKey();
    T val = this.value_rle.get(total);
    if ((this.history) != null)
        this.history.put(val);
    
    return val;
}