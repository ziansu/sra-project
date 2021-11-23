private void grow() {
    T[] newElements = ((T[]) (new java.lang.Object[(this.elements.length) * 2]));
    java.lang.System.arraycopy(this.elements, 0, newElements, 0, this.count);
    this.elements = newElements;
}