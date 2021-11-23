public void set(int y, int x, float value) {
    if ((x <= (m[0].length)) && (y <= (m.length)))
        m[y][x] = value;
    
}