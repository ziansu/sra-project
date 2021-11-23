public void add(T value, int dist) {
    addLast(value);
    d2goal[tail] = dist;
    java.lang.System.out.println(((("Added.\n" + (toString())) + "\n") + (toStringD2G())));
}