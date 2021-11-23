public void add(T value, int dist) {
    addLast(value);
    d2goal[tail] = dist;
}