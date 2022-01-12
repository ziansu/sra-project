public float get(int y, int x) {
    if ((x <= (m[0].length)) && (y <= (m.length)))
        return m[y][x];
    
    return 0;
}