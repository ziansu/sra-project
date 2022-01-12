public char getTile(int x, int y) {
    if (!((((x < 0) || (y < 0)) || (x > ((this.map.length) - 1))) || (y > ((this.map[0].length) - 1)))) {
        java.lang.Character val = this.map[x][y];
        return val != null ? val : '?';
    }
    return '?';
}