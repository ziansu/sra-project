public java.lang.String parse(java.lang.String string, java.util.Map<java.lang.String, java.lang.Object> values) {
    this.values = values;
    parse.ParseCursor parseCursor = new parse.ParseCursor(string);
    parse.PrintStringParser.State state = new parse.PrintStringParser.StringParser().parse(parseCursor, new parse.PrintStringParser.State());
    this.values = null;
    return java.lang.String.format(state.builder.toString(), state.objects.toArray());
}