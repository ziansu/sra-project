public boolean isCellInMap(int x, int y) {
    return (((0 <= x) && (x < (map.length))) && (0 <= y)) && (y < (map[0].length));
}