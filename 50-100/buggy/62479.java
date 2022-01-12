@java.lang.Override
public java.lang.Object visitSymbolPredicate(nez.lang.Nez.SymbolPredicate e, java.lang.Object a) {
    BeginScope();
    java.lang.String pos = savePos();
    visit(e, a);
    if ((e.op) == (nez.lang.FunctionName.is)) {
        Statement(ParserFunc("equals", _symbol(e.tableName), pos));
    }else {
        Statement(ParserFunc("contains", _symbol(e.tableName), pos));
    }
    EndScope();
    return null;
}