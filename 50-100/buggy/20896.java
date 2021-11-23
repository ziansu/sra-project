@java.lang.Override
public void syntaxError(org.uva.taxfree.ql.ast.Recognizer<?, ?> recognizer, java.lang.Object o, int line, int column, java.lang.String message, org.uva.taxfree.ql.ast.RecognitionException e) {
    semanticsMessages.addError(((((("(" + line) + ":") + column) + "):") + e));
    throw new java.lang.UnsupportedOperationException(e);
}