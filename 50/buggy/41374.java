public com.miracle.symbol.type.MiracleBaseType getBuiltinType(java.lang.String name) {
    if (com.miracle.symbol.MiracleSymbolTable.builtinType.containsKey(name)) {
        return ((com.miracle.symbol.type.MiracleBaseType) (com.miracle.symbol.MiracleSymbolTable.builtinType.get(name).getType()));
    }
    return null;
}