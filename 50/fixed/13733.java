@java.lang.Override
public void fillSymbolTable(org.uva.taxfree.model.environment.SymbolTable symbolTable) {
    super.fillSymbolTable(symbolTable);
    symbolTable.addCalculation(this);
    mExpression.fillSymbolTable(symbolTable);
}