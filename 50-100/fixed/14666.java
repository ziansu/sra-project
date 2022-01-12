public java.lang.String getPartialKeyword() {
    if ((keywordType) != null) {
        return interpreter.separator.InputSeparator.EMPTY_STRING;
    }
    for (interpreter.separator.InputSeparator.KeywordType type : interpreter.separator.InputSeparator.KeywordType.values()) {
        if ((commandHasKeyword(commandType, type)) && (type.toString().startsWith(parameter.toLowerCase()))) {
            return getAutoCompleteWord(type);
        }
    }
    return interpreter.separator.InputSeparator.EMPTY_STRING;
}