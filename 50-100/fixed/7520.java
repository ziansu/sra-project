public int colContains(int x, int num) {
    int count = 0;
    for (int o = 0; o < 9; o++) {
        if ((this.grid[o][x].value) == num)
            count++;
        
    }
    return count;
}