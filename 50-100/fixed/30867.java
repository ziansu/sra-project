@java.lang.Override
public void rowProcessed(java.lang.Object[] row, com.univocity.parsers.common.ParsingContext parsingContext) {
    if ((row.length) <= 1) {
        input.InputHandlerTSV.logger.warn("Ignoring line without tab while parsing.");
        return ;
    }
    java.lang.String queryString = decode(row[0].toString(), inputFile, parsingContext.currentLine());
    outputHandler.writeLine(queryString, row, parsingContext.currentLine(), inputFile);
}