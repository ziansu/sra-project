@java.lang.Override
public void reportUnwantedToken(org.antlr.v4.runtime.Parser parser) {
    org.antlr.v4.runtime.Token token = parser.getCurrentToken();
    int line = getMissingSymbol(parser).getLine();
    int position = getMissingSymbol(parser).getCharPositionInLine();
    java.lang.String msg = ((getSourceLocation(parser, line, position)) + "unwanted token ") + (getTokenErrorDisplay(token));
    if (!(org.ballerinalang.composer.service.workspace.rest.datamodel.BallerinaComposerErrorStrategy.EOF.equals(getTokenErrorDisplay(token)))) {
        errorTokens.add(createError(line, position, msg));
    }
}