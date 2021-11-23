public void addLast(T value) {
    (tail)++;
    if ((size) >= (queue.length)) {
        (tail)--;
        enlarge();
        this.addLast(value);
        return ;
    }
    if ((tail) > ((queue.length) - 1)) {
        tail = 0;
    }
    queue[tail] = value;
    (size)++;
}