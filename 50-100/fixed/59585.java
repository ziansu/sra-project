public void run() {
    AI();
    move();
    if (((((int) (x)) != (lx)) || (((int) (y)) != (ly))) || ((lgen) != (Display.gen))) {
        lx = ((int) (x));
        ly = ((int) (y));
        lgen = Display.gen;
    }
    (gen)++;
}