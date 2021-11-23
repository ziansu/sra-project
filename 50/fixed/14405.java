private java.lang.String getOptionalValue(seedu.ezdo.logic.parser.ArgumentTokenizer tokenizer, seedu.ezdo.logic.parser.ArgumentTokenizer.Prefix prefix) {
    if (!(tokenizer.getValue(prefix).isPresent())) {
        return "";
    }else {
        return tokenizer.getValue(prefix).get();
    }
}