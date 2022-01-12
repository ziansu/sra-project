public boolean contains(final int pos) {
    if (pos < 0) {
        return false;
    }
    final java.lang.String key = (giusa.parser.parameter.ParameterParser.PREFIX_UNNAMED_PARAMETER) + pos;
    return this.contains(key);
}