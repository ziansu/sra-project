private java.lang.String dimensionStr(semanticAnalysis.SymbolTable.Entry e) {
    java.lang.String str = "";
    for (int i : e.array_sizes) {
        str += ("[" + i) + "]";
    }
    return str;
}