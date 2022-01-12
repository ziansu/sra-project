private boolean isDeleteAttribute(java.lang.String paras) {
    return (((paras.startsWith(parser.Parser.KEYWORD_START_TIME)) || (paras.startsWith(parser.Parser.KEYWORD_END_TIME))) || (paras.startsWith(parser.Parser.KEYWORD_DEADLINE))) && (!(isTagRecurring(paras)));
}