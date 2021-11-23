public static io.github.theangrydev.opper.corpus.FixedCorpus corpus(io.github.theangrydev.opper.grammar.Grammar grammar, java.lang.String... symbols) {
    return new io.github.theangrydev.opper.corpus.FixedCorpus(java.util.Arrays.stream(symbols).map(grammar::symbolByName).iterator());
}