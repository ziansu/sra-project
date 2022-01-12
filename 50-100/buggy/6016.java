protected java.lang.String translateRegexp(java.lang.String pattern) throws org.exist.xquery.functions.fn.XPathException {
    try {
        final int xmlVersion = 11;
        final boolean ignoreWhitespace = false;
        final boolean caseBlind = false;
        pattern = org.exist.xquery.regex.JDK15RegexTranslator.translate(pattern, xmlVersion, true, ignoreWhitespace, caseBlind);
    } catch (final org.exist.xquery.regex.RegexSyntaxException e) {
        throw new org.exist.xquery.functions.fn.XPathException(this, (("Conversion from XPath2 to Java regular expression " + "syntax failed: ") + (e.getMessage())), e);
    }
    return pattern;
}