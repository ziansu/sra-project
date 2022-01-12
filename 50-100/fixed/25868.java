public static void generatePrintMessage(java.util.ArrayList<grammars.grammars.PrintableObject> names, grammars.grammars.GrammarsGeneral grammar, java.lang.String type, boolean usePronoun, boolean useAnd) {
    grammars.grammars.GrammarIndividual grammarIndividual = grammar.getRandomGrammar();
    main.Main.printMessage(main.Main._getMessage(grammarIndividual, names, type, usePronoun, useAnd));
}