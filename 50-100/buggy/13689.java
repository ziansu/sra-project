@java.lang.Override
public void syntaxError(com.juliar.errors.Recognizer<?, ?> recognizer, java.lang.Object offendingSymbol, int line, int charPositionInLine, java.lang.String msg, com.juliar.errors.RecognitionException e) {
    java.lang.String errorMessage = (((("error on line " + line) + " at column ") + charPositionInLine) + " ") + (msg.toString());
    errorList.add(errorMessage);
    java.lang.Object context = ((com.juliar.errors.Parser) (recognizer)).getRuleInvocationStack();
    super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
}