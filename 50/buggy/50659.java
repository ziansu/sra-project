org.parboiled.Rule BooleanExpression() {
    return FirstOf(UnaryBooleanOperation(), BooleanOperation(), Comparison(), BooleanLiteral(), Sequence("(", BooleanExpression(), ")"), BooleanColumn());
}