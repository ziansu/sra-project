public void pushVariableName(java.lang.String name) {
    java.util.List<java.lang.String> currentScope = symbolTable.peek();
    currentScope.add(name);
}