private void checkColidateDiagonal(int i) {
    removeRightUp(i, 0);
    removeLeftUp(i, 0);
    removeRightDown(i, 0);
    removeLeftDown(i, 0);
    setCounter(((getCounter()) - 1));
}