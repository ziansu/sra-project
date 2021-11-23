protected void doConvert(mondo.token.ITokenizer tokenizer) {
    insertBracketAfterEventually(tokenizer);
    try {
        text = functionMap.get(originalText).apply(originalText);
    } catch (java.lang.NullPointerException e) {
        try {
            text = tokenFunctionMap.get(originalText).apply(this);
        } catch (java.lang.NullPointerException ee) {
        }
    }
}