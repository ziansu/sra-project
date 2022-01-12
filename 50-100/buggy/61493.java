public java.lang.String toString() {
    if ((queue.length) == 0) {
        return "[]";
    }
    java.lang.String a = "[" + (queue[head]);
    for (int i = (head) + 1; i != ((tail) + 1); i++) {
        if (i >= (queue.length)) {
            i = 0;
        }
        a += ", " + (queue[i]);
    }
    a += "]";
    return a;
}