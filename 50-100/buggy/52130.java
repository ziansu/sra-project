public java.lang.String parse(java.lang.String string, java.util.Map<java.lang.String, java.lang.Object> values) {
    this.values = values;
    java.util.List<parse.ScopeParser<parse.PrintStringParser.State>> parsers = java.util.Collections.singletonList(new parse.PrintStringParser.StringParser());
    parse.ParseCursor parseCursor = new parse.ParseCursor(string);
    parse.PrintStringParser.State state = new parse.BaseScopeParser(parsers).parse(parseCursor, new parse.PrintStringParser.State());
    this.values = null;
    return java.lang.String.format(state.builder.toString(), state.objects.toArray());
}