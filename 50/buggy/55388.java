public void add(T value, int priority) {
    if ((size) == (d.length)) {
        grow();
        growPri();
    }
    addFirst(value);
    pri[head] = priority;
}