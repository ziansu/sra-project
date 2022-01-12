public static Parser.OperatorGroup getLowestPrecedenceOperator(Parser.TokenGroup group) {
    Parser.OperatorGroup opGrp = OperatorGroup.Primary;
    for (int i = 0; i < (group.tokens.size()); i++) {
        Token currToken = group.tokens.get(i);
        if ((currToken instanceof Token.Operator) && ((((Token.Operator) (currToken)).opGrp.compareTo(opGrp)) > 0)) {
            opGrp = ((Token.Operator) (currToken)).opGrp;
        }
    }
    return opGrp;
}