private java.lang.String getFormatPattern(java.lang.String label) {
    label = label.trim();
    int indexOpenBracket = label.indexOf("[");
    int indexCloseBracket = (label.endsWith("]")) ? (label.length()) - 1 : -1;
    if ((indexOpenBracket > 0) && (indexCloseBracket > indexOpenBracket)) {
        return label.substring((indexOpenBracket + 1), indexCloseBracket);
    }else {
        return null;
    }
}