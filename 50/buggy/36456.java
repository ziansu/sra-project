public void map(java.util.function.Consumer<T> c) {
    this.change();
    c.accept(this.getValue());
}