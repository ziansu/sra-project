public SemanticAnalysis.VariableSymbolInfo searchField(java.lang.String symbolName) {
    if ((this.fields) != null) {
        for (int i = 0; i < (this.fields.size()); i++) {
            if (this.fields.get(i).symbolName.equals(symbolName))
                return this.fields.get(i);
            
        }
    }
    return null;
}