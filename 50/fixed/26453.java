T next() {
    if ((++(head)) == (size)) {
        head = 0;
    }
    return elements[head];
}