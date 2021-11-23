public void addFirst(T value) {
    if (((head) == (tail)) && ((storage[head]) != null)) {
        resize();
    }
    storage[head] = value;
    head = ((head) - 1) % (storage.length);
}