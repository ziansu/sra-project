public static void printActiveSubstances(java.lang.String section, java.lang.String[] ir) {
    nlp.ITokenizer t = new nlp.SimpleTokenizer();
    java.lang.String[] tokens = t.tokenize(section);
    for (int i = 0; i < (tokens.length);) {
        int step = domain.Section.checkOccurences(tokens, ir, i);
        java.lang.System.out.println((((tokens[i]) + "-") + (ir[i])));
        i += step;
    }
}