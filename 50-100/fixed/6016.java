protected java.lang.String translateRegexp(final java.lang.String pattern, final boolean ignoreWhitespace, final boolean caseBlind) throws org.exist.xquery.functions.fn.XPathException {
    try {
        final int xmlVersion = 11;
        return org.exist.xquery.regex.JDK15RegexTranslator.translate(pattern, xmlVersion, true, ignoreWhitespace, caseBlind);
    } catch (final org.exist.xquery.regex.RegexSyntaxException e) {
        throw new org.exist.xquery.functions.fn.XPathException(this, (("Conversion from XPath2 to Java regular expression " + "syntax failed: ") + (e.getMessage())), e);
    }
}