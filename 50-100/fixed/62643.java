public java.lang.String[] getText() {
    final java.lang.String[] strings = new java.lang.String[(super.getHeight()) + 1];
    java.lang.String temp = "";
    for (int i = 0; i < (super.getHeight()); i++) {
        for (final char c : enteredText[i]) {
            temp += c;
        }
        strings[i] = temp;
        temp = "";
    }
    return strings;
}