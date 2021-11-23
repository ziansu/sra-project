public T peek() {
    if ((this.contents.length) == 0) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return this.contents[((this.contents.length) - 1)];
}