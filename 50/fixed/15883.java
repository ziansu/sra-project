public boolean update() {
    state = next;
    next = 0;
    java.lang.System.out.println(((state) + " state"));
    return (state) == 1;
}