public void run() {
    if ((getLeft()) == 0) {
        this.cancel();
        end();
    }
    this.run(getLeft());
    (left)--;
}