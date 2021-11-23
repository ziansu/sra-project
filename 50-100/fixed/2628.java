public java.lang.Object[] toArray() {
    final int[] values = this.values;
    final java.lang.Object[] array = new java.lang.Object[this.size];
    int i = 0;
    for (int value : values) {
        if (value != (missingValue)) {
            array[(i++)] = value;
        }
    }
    return array;
}