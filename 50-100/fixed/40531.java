@java.lang.Override
public java.lang.String getAutoWord() {
    if ((inputSeparator.getID()) != null) {
        if (((inputSeparator.getKeywordType()) == (InputSeparator.KeywordType.START)) || ((inputSeparator.getKeywordType()) == (InputSeparator.KeywordType.END))) {
            java.lang.String remove = interpreter.prompt.EditPrompt.REMOVE;
            if (remove.startsWith(inputSeparator.getParameter().toLowerCase())) {
                return remove;
            }
        }
        return inputSeparator.getPartialKeyword();
    }
    return interpreter.prompt.EditPrompt.EMPTY_STRING;
}