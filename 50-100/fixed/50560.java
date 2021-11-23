private static void visitLocal(relay.nodes.BlockNode block, relay.symbolTable.SymbolTable symbolTable) {
    block.setSymbolTable(symbolTable);
    for (relay.nodes.BlockNode child : block.childBlocks) {
        relay.symbolTable.SymbolTable childTable = symbolTable.copyOf();
        relay.symbolTable.SymbolTableBuilder.putBlockSymbols(ReservedKeyword.parent.name(), block.dimensions, childTable);
        relay.symbolTable.SymbolTableBuilder.visitLocal(child, childTable);
    }
}