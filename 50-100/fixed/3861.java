public void add(double val, int... keys) throws java.lang.Exception {
    int index = findIndex(keys);
    if (index >= 0) {
        values.set(index, ((values.get(index)) + val));
    }else {
        set(val, keys);
    }
}