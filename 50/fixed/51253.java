public int[] getData() {
    if (!(this.shouldRead.get())) {
        return null;
    }
    if (first.get()) {
        return null;
    }
    return data;
}