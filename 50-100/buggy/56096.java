protected boolean move(int x, int y) {
    if (!(checkMove(x, y))) {
        return false;
    }else {
        wipe();
        home.move(x, y);
        draw();
        return true;
    }
}