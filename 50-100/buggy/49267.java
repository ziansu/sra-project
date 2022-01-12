private void resize(int capacity) {
    Item[] elements = ((Item[]) (new java.lang.Object[capacity]));
    this.capacity = capacity;
    for (int i = 0; i < (n); i++) {
        elements[i] = this.elements[i];
    }
    this.elements = elements;
}