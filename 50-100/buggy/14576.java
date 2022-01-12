private analysis.Type getTypeFromContext(grammar.CracklParser.TypeContext ctx) {
    grammar.CracklParser.PrimitiveContext primCtx = ctx.primitive();
    analysis.Type type = analysis.Type.get(primCtx.getText());
    if ((ctx.PTRTYPE()) != null) {
        type = new analysis.Pointer(type);
    }
    return type;
}