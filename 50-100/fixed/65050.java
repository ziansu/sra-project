private int next() {
    int value = 0;
    int newValue = 0;
    do {
        value = index.get();
        newValue = (value == ((exes.length) - 1)) ? 0 : value + 1;
    } while (!(index.compareAndSet(value, newValue)) );
    return newValue;
}