private T removeLast() {
    T[] newElements = ((T[]) (new java.lang.Object[this.elements.length]));
    java.lang.System.arraycopy(this.elements, 0, newElements, 0, ((this.count) - 1));
    T removedValue = this.elements[((this.count) - 1)];
    this.elements = newElements;
    return removedValue;
}