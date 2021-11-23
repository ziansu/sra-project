public void openScope() {
    currentTable = new RecursiveSymbolTable(currentTable);
}