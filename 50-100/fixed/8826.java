@java.lang.Override
public void parseLine(java.lang.String line) {
    services.FavouriteQuoteImporter.LOGGER.debug("Parsing line: {}", line);
    if (line.trim().isEmpty()) {
        return ;
    }
    java.util.regex.Matcher matcher = services.FavouriteQuoteImporter.PATTERN.matcher(line);
    while (matcher.find()) {
        services.quotes.Quote quote = assembleQuote(matcher);
        quoteDao.insertQuote(quote);
        return ;
    } 
}