public void print(java.io.PrintStream out) {
    for (int cRows = 0; cRows < (getRows()); cRows++) {
        for (int cCols = 0; cCols < (getColumns()); cCols++)
            out.print(((" " + (getCell(cCols, cRows))) + " "));
        
        out.println("");
    }
}