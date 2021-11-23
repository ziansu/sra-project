public org.parboiled.Rule TermList(org.parboiled.support.Var<java.lang.Integer> counter) {
    return Sequence(Term(), ZeroOrMore(',', TermList(counter)));
}