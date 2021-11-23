public void addConnection() {
    (this.count)++;
    if ((this.counter) != null) {
        this.counter.setText(("Connected: " + (this.count)));
    }
}