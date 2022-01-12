private nez.Grammar newGrammarImpl(java.lang.String path) throws java.io.IOException {
    return aux(nez.lang.GrammarFileLoader.loadGrammar(path, strategy));
}