public void addLast(T value) {
    if (((head) == (tail)) && ((storage[head]) != null)) {
        resize();
    }
    storage[tail] = value;
    tail = ((tail) + 1) % (storage.length);
}