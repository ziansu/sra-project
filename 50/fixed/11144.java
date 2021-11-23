public void add(T value, int priority) {
    priorities[((last) % (priorities.length))] = priority;
    addLast(value);
}