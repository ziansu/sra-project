private analysis.Type getTypeFromContext(grammar.CracklParser.TypeContext ctx) {
    analysis.Type type;
    if ((ctx.primitive()) == null) {
        type = new analysis.Pointer(getTypeFromContext(ctx.type()));
    }else {
        grammar.CracklParser.PrimitiveContext primCtx = ctx.primitive();
        type = analysis.Type.get(primCtx.getText());
        if ((ctx.PTRTYPE()) != null) {
            type = new analysis.Pointer(type);
        }
    }
    return type;
}