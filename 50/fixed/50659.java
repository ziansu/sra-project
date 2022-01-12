org.parboiled.Rule BooleanExpression() {
    return FirstOf(BooleanOperation(), Comparison(), UnaryBooleanOperation(), BooleanLiteral(), Sequence("(", BooleanExpression(), ")"), BooleanColumn());
}