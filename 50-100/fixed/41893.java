public void addLast(T value) {
    (tail)++;
    if ((size) >= (length())) {
        (tail)--;
        enlarge();
        this.addLast(value);
        return ;
    }
    if ((tail) > ((length()) - 1)) {
        tail = 0;
    }
    queue[tail] = value;
    (size)++;
}