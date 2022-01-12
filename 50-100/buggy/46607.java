@java.lang.Override
public java.lang.Object visitSymbolAction(nez.lang.Nez.SymbolAction e, java.lang.Object a) {
    BeginScope();
    java.lang.String pos = savePos();
    visit(e, a);
    Statement(ParserFunc("addSymbol", _symbol(e.tableName), pos));
    EndScope();
    return null;
}