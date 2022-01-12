void print() {
    java.lang.System.out.println(("Symbol table " + (scopeName)));
    symbolList.forEach(( item) -> {
        if ((item.getClass()) == (SymbolTable.class)) {
            java.lang.System.out.println("");
            ((SymbolTable) (item)).print();
        }else
            if ((item.getClass()) == (SymbolTable.Symbol.class)) {
                ((SymbolTable.Symbol) (item)).print();
            }
        
    });
}