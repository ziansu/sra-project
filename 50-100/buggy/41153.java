public java.lang.String getText() {
    if ((text) == null) {
        return "";
    }
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    for (int i = 0; i < (text.length); i++) {
        b.append(text[0]);
        if ((i + 1) < (text.length)) {
            b.append('\n');
        }
    }
    return b.toString();
}