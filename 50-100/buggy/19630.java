public static seedu.multitasky.logic.parser.ArgumentMultimap tokenize(java.lang.String argsString, seedu.multitasky.logic.parser.Prefix... prefixes) {
    java.util.List<seedu.multitasky.logic.parser.ArgumentTokenizer.PrefixPosition> positions = seedu.multitasky.logic.parser.ArgumentTokenizer.findAllPrefixPositions(((" " + argsString) + " "), prefixes);
    return seedu.multitasky.logic.parser.ArgumentTokenizer.extractArguments(((" " + argsString) + " "), positions);
}