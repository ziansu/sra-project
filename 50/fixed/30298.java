public Syntax.SyntaxElement ancestor(Syntax.SyntaxBuilder.Grammar grammar) {
    if (grammar.equals(getGrammar()))
        return this;
    
    if ((parent) == null)
        return null;
    
    return parent.ancestor(grammar);
}