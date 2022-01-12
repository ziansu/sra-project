public void remove() {
    if ((this.index) < 0) {
        throw new java.lang.RuntimeException((("Element " + (this)) + " already deleted"));
    }
    removeAt(this.index);
}