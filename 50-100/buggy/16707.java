public char getTile(int x, int y) {
    if (!((x < 0) || (y < 0))) {
        java.lang.Character val = this.map[x][y];
        return val != null ? val : '?';
    }
    return '?';
}