org.parboiled.Rule NumericLiteral() {
    return FirstOf(IntegerLiteral(), DecimalLiteral(), DoubleLiteral());
}