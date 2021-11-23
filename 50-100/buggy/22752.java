private boolean isDeleteAttribute(java.lang.String paras) {
    return (((paras.contains(parser.Parser.KEYWORD_START_TIME)) || (paras.contains(parser.Parser.KEYWORD_END_TIME))) || (paras.contains(parser.Parser.KEYWORD_DEADLINE))) && (!(isTagRecurring(paras)));
}