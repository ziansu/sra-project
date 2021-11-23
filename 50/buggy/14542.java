public float get(int x, int y) {
    if ((x <= (m.length)) && (y <= (m[0].length)))
        return m[x][y];
    
    return 0;
}