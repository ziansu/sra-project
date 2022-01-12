private static ru.spbau.bocharov.cli.common.QuoteString createQuoteString(java.lang.String bodyWithQuotes) {
    java.lang.String body = bodyWithQuotes;
    if (isQuote(bodyWithQuotes.charAt(0))) {
        body = bodyWithQuotes.substring(1, ((bodyWithQuotes.length()) - 1));
    }
    return (body.charAt(0)) == (ru.spbau.bocharov.cli.parser.ParseUtils.ParseUtils.STRONG_QUOTE) ? new ru.spbau.bocharov.cli.parser.quotes.StrongQuoteString(ru.spbau.bocharov.cli.parser.Parser.removeBackslashes(body)) : new ru.spbau.bocharov.cli.parser.quotes.WeakQuoteString(ru.spbau.bocharov.cli.parser.Parser.removeBackslashes(body));
}