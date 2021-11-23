public int insert(compiler.Symbol symbol, compiler.ast.type.Type type) {
    changeStack.push(new compiler.semantic.symbolTable.Change(symbol, symbol.getDeclaration(), symbol.getDeclarationScope()));
    int variableNumber = (localVariables)++;
    symbol.setDeclaration(currentScope, new compiler.ast.declaration.LocalVariableDeclaration(type, symbol, variableNumber));
    return variableNumber;
}