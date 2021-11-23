private kalang.core.Type parseSingleType(kalang.antlr.KalangParser.SingleTypeContext singleTypeContext) {
    if ((singleTypeContext.Identifier()) != null) {
        return requireClassType(singleTypeContext.Identifier().getSymbol());
    }else {
        return kalang.core.Types.getPrimitiveType(singleTypeContext.getText());
    }
}