public void addRef(long ref, int sequence) {
    this.getRefs().add((sequence - 1), ref);
}