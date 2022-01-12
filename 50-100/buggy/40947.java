public void cover(int x, int y, int w, int h) {
    cover.x = x;
    cover.y = y;
    cover.w = w;
    cover.h = h;
    screen.cleanUp();
    screen = new libJ2D.buffer.IntBuffer(w, h, (-1));
    int i = 0;
    for (libGame.gui.Item item : menuitems) {
        redraw(item, (i++));
    }
}