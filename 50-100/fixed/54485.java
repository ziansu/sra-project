public void visit(Symbol.ParamList pl) {
    for (int i = 0; i < (pl.length); i++) {
        Symbol.Symboll id = pl.getSymbol(i);
        Symbol.Type type = pl.getType(i);
        id = new Symbol.Symboll(type.ty, id.name, id.array, false, i, id.line, id.pos, false);
        pl.replaceSymbol(i, id);
        current.addBind(id.name, id);
    }
}