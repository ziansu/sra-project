public static java.util.List<org.apache.hadoop.hbase.Cell> cellScannerToCellList(org.apache.hadoop.hbase.CellScanner cScanner) throws java.io.IOException {
    java.util.List<org.apache.hadoop.hbase.Cell> lCells = new java.util.LinkedList<>();
    while (cScanner.advance()) {
        lCells.add(cScanner.current());
    } 
    return lCells;
}