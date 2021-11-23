public void move(int r1, int c1, int r2, int c2, int rDest, int cDest) {
    copy(r1, c1, r2, c2, rDest, cDest);
    delete(r1, c1, r2, c2);
}