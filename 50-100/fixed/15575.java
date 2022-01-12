public com.kylecorry.matrix.Matrix map(com.kylecorry.matrix.Matrix.Function fn) {
    com.kylecorry.matrix.Matrix mapped = new com.kylecorry.matrix.Matrix(getNumRows(), getNumCols());
    for (int row = 0; row < (getNumRows()); row++)
        for (int col = 0; col < (getNumCols()); col++)
            mapped.set(row, col, fn.function(get(row, col)));
        
    
    return mapped;
}