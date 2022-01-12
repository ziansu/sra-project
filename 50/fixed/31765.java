org.parboiled.Rule StringLiteral() {
    return Sequence("\"", ZeroOrMore(Character()), push(matchOrDefault("")), "\"");
}