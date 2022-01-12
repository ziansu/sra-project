public void incrementCell(int x, int y) {
    if (!(this.grid[y][x].modifiable))
        throw new java.lang.RuntimeException("Cannot increment cell; user defined");
    else
        if ((this.grid[y][x].value) == 9)
            throw new java.lang.RuntimeException("Cannot increment cell; maximum possible cell value");
        else
            (this.grid[y][x].value)++;
        
    
}