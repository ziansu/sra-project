public void addFirst(T value) {
    if (((size) + 1) > (d.length)) {
        grow();
    }
    if ((d[head]) != null) {
        if ((head) == 0) {
            head = (d.length) - 1;
        }else {
            (head)--;
        }
    }
    d[head] = value;
    (size)++;
}