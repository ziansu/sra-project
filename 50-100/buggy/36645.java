@java.lang.Override
public void visitPair(sslr.typed.json.parser.tree.PairTree tree) {
    sslr.typed.json.parser.SyntaxToken name = tree.name();
    if (tree.value().value().is(Kind.TOKEN)) {
        sslr.typed.json.parser.SyntaxToken value = ((sslr.typed.json.parser.SyntaxToken) (tree.value().value()));
        if (name.text().equals(value.text())) {
            throw new java.lang.IllegalArgumentException("Wrong!");
        }
    }
}