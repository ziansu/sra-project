public boolean contains(Syntax.SyntaxBuilder.Grammar grammar) {
    for (Syntax.SyntaxElement child : children) {
        if (child.getGrammar().equals(grammar.name()))
            return true;
        
    }
    return false;
}