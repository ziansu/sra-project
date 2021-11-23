private java.lang.String addLineBreaks(java.lang.String text) {
    if (text.substring(0, 2).equalsIgnoreCase("\\p")) {
        text = text.substring(2);
    }
    text = text.replace("\\b", "<br/><br/>");
    java.lang.String sRegex = "\\\\pi\\d*";
    text = text.replaceAll(sRegex, ("<br/>" + (model.parsers.USFMParser.TAB)));
    text = text.replace("\\p", "<br/>");
    return text;
}