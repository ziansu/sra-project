@java.lang.Override
protected com.cowlark.cowbel.parser.core.ParseResult parseImpl(com.cowlark.cowbel.parser.core.Location location) {
    com.cowlark.cowbel.parser.core.ParseResult pr = com.cowlark.cowbel.parser.parsers.OpenParenthesisParser.parse(location);
    if (pr.failed())
        return pr;
    
    com.cowlark.cowbel.parser.core.ParseResult argumentspr = com.cowlark.cowbel.parser.parsers.ExpressionListParser.parse(pr.end());
    if (argumentspr.failed())
        return argumentspr;
    
    pr = com.cowlark.cowbel.parser.parsers.CloseParenthesisParser.parse(pr.end());
    if (pr.failed())
        return pr;
    
    argumentspr.setEnd(pr.end());
    return argumentspr;
}