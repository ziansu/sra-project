public void draw() {
    background(0, 0, 0);
    for (int i = 0; i < (bob.length); i++) {
        bob[i].show();
        bob[i].move();
    }
}