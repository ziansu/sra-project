public int rowContains(int y, int num) {
    int count = 0;
    for (int o = 0; o < 9; o++) {
        if ((this.grid[y][o].value) == num)
            count++;
        
    }
    return count;
}