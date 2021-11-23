public void remove() {
    int index = (this.nextIndex) - 1;
    if ((this.removed) || (index < 0)) {
        throw new java.lang.IllegalArgumentException();
    }
    this.remove(index);
    (this.nextIndex)--;
    this.removed = true;
}