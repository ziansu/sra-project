public void enqueue(T element) {
    if ((this.count) >= (this.elements.length)) {
        this.grow();
    }
    this.elements[endIndex] = element;
    endIndex = ((endIndex) + 1) % (this.elements.length);
    (this.count)++;
}