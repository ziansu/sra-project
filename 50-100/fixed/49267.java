private void resize(int capacity) {
    capacity = (capacity < 1) ? 1 : capacity;
    Item[] elements = ((Item[]) (new java.lang.Object[capacity]));
    this.capacity = capacity;
    for (int i = 0; i < (n); i++) {
        elements[i] = this.elements[i];
    }
    this.elements = elements;
}