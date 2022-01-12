@java.lang.Override
public java.lang.Object visitBlockScope(nez.lang.Nez.BlockScope e, java.lang.Object a) {
    BeginScope();
    saveSymbol();
    visit(e.get(0), a);
    backSymbol();
    EndScope();
    return null;
}