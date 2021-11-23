protected boolean move(int x, int y) {
    if (!(checkMove(x, y))) {
        return false;
    }else {
        wipe();
        home.move(((home.x) + x), ((home.y) + y));
        draw();
        return true;
    }
}