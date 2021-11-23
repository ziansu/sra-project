private java.lang.String applyQuantifier(java.lang.String text, java.lang.String separator) {
    text = text.replace(".", getRandomValue());
    if ((text.length()) > 1) {
        text = text.replace(separator, "");
    }
    java.lang.StringBuilder repeatedValue = new java.lang.StringBuilder();
    for (int i = 0; i < (getRandomInt(separator)); i++) {
        repeatedValue.append(text);
    }
    return repeatedValue.toString();
}