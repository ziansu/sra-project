public java.lang.Object[] toArray() {
    final int[] values = this.values;
    final java.lang.Object[] ret = new java.lang.Object[size];
    for (int from = 0, to = 0; from < (values.length); from++) {
        final int val = values[from];
        if (val != (missingValue)) {
            ret[(to++)] = val;
        }
    }
    return ret;
}