public void add(T value, int priority) {
    priorities[last] = priority;
    addLast(value);
}