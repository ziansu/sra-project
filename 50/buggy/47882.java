public java.lang.String convertStringForTSV(java.lang.String text) {
    if (text.contains("\"")) {
        text = ("\"" + (text.replaceAll("\"", "\"\""))) + "\"";
    }
    return text;
}