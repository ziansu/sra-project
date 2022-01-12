private java.lang.String transliterate(java.lang.String txt) {
    if ((txt == null) || (txt.isEmpty())) {
        return txt;
    }
    java.lang.StringBuilder message = new java.lang.StringBuilder();
    char[] chars = txt.toCharArray();
    for (char c : chars) {
        message.append(transliterate(c));
    }
    return message.toString();
}