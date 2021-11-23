@java.lang.Override
public ashc.grammar.TypeI getExprType() {
    return ashc.grammar.TypeI.getPrecedentType(exprTrue.getExprType(), exprFalse.getExprType());
}