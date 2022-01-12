public void draw() {
    background(bacteria.bacteriaColor, 0, 0);
    for (int i = 0; i < (bob.length); i++) {
        bob[i].show();
        bob[i].move();
    }
}