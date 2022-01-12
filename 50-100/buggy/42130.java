public boolean getValueAt(int x, int y) {
    if ((((x < 0) || (x > (width))) || (y < 0)) || (y > (height))) {
        return false;
    }
    return samples[y][x];
}