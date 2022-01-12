@java.lang.Override
public void reportNoViableAlternative(org.antlr.v4.runtime.Parser parser, org.antlr.v4.runtime.NoViableAltException e) {
    org.antlr.v4.runtime.Token token = parser.getCurrentToken();
    int line = getMissingSymbol(parser).getLine();
    int position = getMissingSymbol(parser).getCharPositionInLine();
    java.lang.String msg = "invalid identifier " + (getTokenErrorDisplay(token));
    if (!(org.ballerinalang.composer.service.workspace.rest.datamodel.BallerinaComposerErrorStrategy.EOF.equals(getTokenErrorDisplay(token)))) {
        errorTokens.add(createError(line, position, msg));
    }
}