public boolean trySet(long n) {
    int bit = 1 << n;
    int index = ((int) (n >>> 5));
    int current;
    int value;
    do {
        current = elements.get(index);
        value = current | bit;
        if (current == value) {
            return false;
        }
    } while (!(elements.compareAndSet(index, current, value)) );
    return true;
}