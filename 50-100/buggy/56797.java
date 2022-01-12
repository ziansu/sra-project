@java.lang.Override
public void enterQuantifier(com.github.simpleregex.parser.SRLParser.QuantifierContext ctx) {
    boolean optional = (ctx.KEYW_OPTIONAL()) != null;
    if (optional)
        addRegexStart(com.github.simpleregex.SRLParseTreeListener.RegexElement.OPTIONAL);
    
    visit(ctx.at_least(), this::enterAt_least);
    visit(ctx.between(), this::enterBetween);
    visit(ctx.exactly(), this::enterExactly);
    visit(ctx.or_more(), this::enterOr_more);
    if (optional)
        addRegexEnd(com.github.simpleregex.SRLParseTreeListener.RegexElement.OPTIONAL);
    
}