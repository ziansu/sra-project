boolean check(java.lang.String signalPhrase) {
    return signalPhrase.toLowerCase().matches(signalPhrasePattern);
}