private kalang.core.Type parseSingleType(kalang.antlr.KalangParser.SingleTypeContext singleTypeContext) {
    if ((singleTypeContext.Identifier()) != null) {
        java.lang.String fn = checkFullType(singleTypeContext.getText(), singleTypeContext);
        if (fn == null)
            return null;
        
        return requireClassType(fn, singleTypeContext.Identifier().getSymbol());
    }else {
        return kalang.core.Types.getPrimitiveType(singleTypeContext.getText());
    }
}