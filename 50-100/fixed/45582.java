@java.lang.Override
public void syntaxError(org.antlr.v4.runtime.Recognizer<?, ?> recognizer, java.lang.Object offendingSymbol, int line, int charPositionInLine, java.lang.String msg, org.antlr.v4.runtime.RecognitionException e) {
    syntaxErrors.put(e, new org.antlr.jetbrains.adaptor.parser.SyntaxError(recognizer, ((org.antlr.v4.runtime.Token) (offendingSymbol)), line, charPositionInLine, msg, e));
}