private void doHyphenation(model.VerbComponent verb) {
    if ((checkPrefixEndingConsonant(verb.getPrefix())) && (checkifRootBeginsVowel(currentVerb.getRoot()))) {
        hasError = true;
        currentStatus.setErrorType(ErrorType.SPELLING);
        currentStatus.appendLog("Hyphenation, ");
        verb.setPrefix(((verb.getPrefix()) + "-"));
    }
    process.MorphedWordGenerator.generateMorphedWord(rootWord, verb);
}