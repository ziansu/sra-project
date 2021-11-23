org.parboiled.Rule StringLiteral() {
    return Sequence(Sequence("\"", ZeroOrMore(Character()), "\""), push(matchOrDefault("")));
}