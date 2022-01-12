public void AutoWin() {
    int size = cube.length;
    int x = r.nextInt(size);
    int y = r.nextInt(size);
    int z = r.nextInt(size);
    cube[x][y][z] = 2048;
}