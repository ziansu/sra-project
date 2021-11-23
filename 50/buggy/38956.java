public void rotate(int _dir) {
    _dir %= 4;
    rotatePS(_dir);
    rotateSN(_dir);
    rotateSI(_dir);
    setDir((((getDir()) + _dir) % 4));
}