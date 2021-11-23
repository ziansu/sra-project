public void move(int move) {
    if (((this.position) + move) > 40) {
        this.addCash(200);
    }
    this.position = ((position) + move) % 16;
}