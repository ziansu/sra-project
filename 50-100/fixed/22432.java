public void addFirst(T value) {
    (head)--;
    if ((head) < 0) {
        head = (length()) - 1;
    }
    if ((size) >= (length())) {
        (head)++;
        enlarge();
        this.addFirst(value);
        return ;
    }
    queue[head] = value;
    (size)++;
}