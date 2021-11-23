public void addMacrosForExpansion(java.lang.String name, de.fosd.typechef.featureexpr.FeatureExpr feature, de.fosd.typechef.lexer.MacroData m) throws de.fosd.typechef.lexer.LexerException {
    addMacro(name, feature, m);
    macrosForExpansion = macrosForExpansion.define(name, feature, m);
}