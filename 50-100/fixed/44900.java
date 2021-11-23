private java.lang.String addQuotedCell(final java.lang.String text, final java.util.List<java.lang.String> values) {
    java.lang.String newText = "";
    java.util.regex.Matcher matcher = this.config().nextQuotePattern().matcher(text);
    if (matcher.find()) {
        newText = this.addCell(text, values, matcher.start(), matcher.end(), false);
    }else {
        this.addLastQuotedCell(text, values);
    }
    return newText;
}