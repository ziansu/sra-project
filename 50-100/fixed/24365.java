public void addFirst(T value) {
    if ((size) == (storage.length)) {
        resize();
    }
    storage[(((storage.length) + (head)) % (storage.length))] = value;
    head = ((storage.length) + ((head) - 1)) % (storage.length);
    (size)++;
}