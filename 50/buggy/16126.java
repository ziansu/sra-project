public org.parboiled.Rule nakedStringLiteral() {
    return Sequence(ZeroOrMore(TestNot(AnyOf("\r\n\"\'\\")), io.smartcat.ranger.parser.ANY), push(match()));
}