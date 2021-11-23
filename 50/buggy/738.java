public Item sample() {
    if (this.isEmpty()) {
        throw new java.util.NoSuchElementException();
    }
    int current = random();
    return s[current];
}