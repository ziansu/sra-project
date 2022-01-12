public void addLast(T value) {
    if ((size) == (storage.length)) {
        resize();
    }
    storage[(((storage.length) + (tail)) % (storage.length))] = value;
    tail = ((storage.length) + ((tail) + 1)) % (storage.length);
    (size)++;
}