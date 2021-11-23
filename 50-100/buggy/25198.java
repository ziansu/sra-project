@java.lang.Override
public void syntaxError(org.antlr.v4.runtime.Recognizer<?, ?> recognizer, java.lang.Object offendingSymbol, int line, int charPositionInLine, java.lang.String msg, org.antlr.v4.runtime.RecognitionException e) {
    errors.add(((((((("Error bij token '" + (offendingSymbol.toString())) + "' op regel ") + line) + ":") + charPositionInLine) + ". Melding: ") + msg));
}