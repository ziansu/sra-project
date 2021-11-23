public void addFirst(java.lang.String s) {
    if (s == null) {
        throw new java.lang.NullPointerException();
    }
    if ((size) >= (data.length)) {
        resize();
    }
    (front)--;
    if ((front) < 0) {
        front = (data.length) - 1;
    }
    data[front] = s;
    (size)++;
    if ((size) == 1) {
        back = front;
    }
}