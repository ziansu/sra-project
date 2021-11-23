public void printIterationEnd(int i) {
    switch (i) {
        case de.monticore.grammar.grammar._ast.ASTConstantsGrammar.PLUS :
        case de.monticore.grammar.grammar._ast.ASTConstantsGrammar.STAR :
            decreaseIndent();
            addToCodeSection((("\n" + (indent)) + ")"));
            decreaseIndent();
            addToCodeSection((("\n" + (indent)) + ", \"actUndefined\" )"));
            break;
        case de.monticore.grammar.grammar._ast.ASTConstantsGrammar.QUESTION :
            decreaseIndent();
            addToCodeSection((("\n" + (indent)) + ")"));
            break;
    }
}