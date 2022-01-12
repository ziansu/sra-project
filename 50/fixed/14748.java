public void change() {
    this.setValue(((T) (function.apply(first.getValue(), t))));
}