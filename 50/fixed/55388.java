public void add(T value, int priority) {
    if ((size) == (d.length)) {
        grow();
    }
    addFirst(value);
    pri[head] = priority;
}