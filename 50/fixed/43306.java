protected static java.lang.Object parseRaw(java.lang.String input) throws org.json.simple.parser.ParseException {
    try {
        return org.mozilla.gecko.sync.ExtendedJSONObject.getJSONParser().parse(input);
    } catch (java.lang.Error e) {
        throw new org.json.simple.parser.ParseException(org.json.simple.parser.ParseException.ERROR_UNEXPECTED_EXCEPTION, e);
    }
}