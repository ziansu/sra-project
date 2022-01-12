@java.lang.Override
public java.lang.Object visitLocalScope(nez.lang.Nez.LocalScope e, java.lang.Object a) {
    BeginScope();
    saveSymbol();
    Statement(ParserFunc("maskSymbolTable", _symbol(e.tableName)));
    visit(e, a);
    backSymbol();
    EndScope();
    return null;
}