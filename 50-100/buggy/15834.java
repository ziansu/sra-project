public void incrementCell(int row, int col) {
    if (!(this.grid[row][col].modifiable))
        throw new java.lang.RuntimeException("Cannot increment cell; user defined");
    else
        if ((this.grid[row][col].value) == 9)
            throw new java.lang.RuntimeException("Cannot increment cell; maximum possible cell value");
        else
            (this.grid[row][col].value)++;
        
    
}