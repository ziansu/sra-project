private nez.Grammar newGrammarImpl(java.lang.String path) throws java.io.IOException {
    if (path.equals("nez")) {
        return aux(new nez.lang.NezGrammar1());
    }
    return aux(nez.lang.GrammarFileLoader.loadGrammar(path, strategy));
}