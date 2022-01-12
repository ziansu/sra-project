private java.lang.String addQuotedCell(final java.lang.String text, final java.util.List<java.lang.String> values) {
    java.lang.String newText = "";
    java.lang.String unquotedText = text.substring(1);
    java.util.regex.Matcher matcher = this.config().nextQuotePattern().matcher(unquotedText);
    if (matcher.find()) {
        newText = this.addCell(unquotedText, values, matcher.start(), matcher.end(), false);
    }else {
        this.addLastQuotedCell(unquotedText, values);
    }
    return newText;
}