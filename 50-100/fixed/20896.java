@java.lang.Override
public void syntaxError(org.uva.taxfree.ql.ast.Recognizer<?, ?> recognizer, java.lang.Object o, int line, int column, java.lang.String message, org.uva.taxfree.ql.ast.RecognitionException e) {
    semanticsMessages.addError(((((("(" + line) + ":") + column) + "):") + message));
    throw new java.lang.UnsupportedOperationException(message);
}