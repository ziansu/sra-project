public int rowContains(int row, int num) {
    int count = 0;
    for (int o = 0; o < 9; o++) {
        if ((this.grid[row][o].value) == num)
            count++;
        
    }
    return count;
}