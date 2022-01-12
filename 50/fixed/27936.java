public de.uniks.networkparser.String.StringContainer nextString(de.uniks.networkparser.String.StringContainer sc, boolean allowCRLF, boolean nextStep, char quote) {
    return nextString(sc, allowCRLF, false, false, nextStep, quote);
}