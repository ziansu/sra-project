public boolean trySet(long n) {
    int bit = 1 << n;
    int index = ((int) (n >>> 5));
    int current = elements.get(index);
    int value = current | bit;
    if ((current == value) || (elements.compareAndSet(index, current, value))) {
        return true;
    }
    return false;
}