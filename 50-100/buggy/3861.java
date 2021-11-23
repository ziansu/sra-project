public void add(double val, int... ndKeys) {
    int index = findIndex(ndKeys);
    if (index >= 0) {
        values.set(index, ((values.get(index)) + val));
    }else {
        set(val, ndKeys);
    }
}