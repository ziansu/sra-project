private static java.util.List<java.lang.String> getGlobalTemp(SymbolTable table) {
    java.util.List<java.lang.String> globalTemp = new java.util.ArrayList<>();
    if (table.getScope().equals("GLOBAL")) {
        java.lang.System.out.println();
        java.lang.System.out.println(";Yes, global");
        for (SymbolEntry se : table.getDecls()) {
            java.lang.String variable = se.getVariable();
            if (variable.startsWith("$L")) {
                globalTemp.add(variable);
            }
        }
    }
    return globalTemp;
}