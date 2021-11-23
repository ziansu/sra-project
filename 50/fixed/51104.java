public double getNumber() {
    java.lang.String text = getText();
    if ((text.length()) == 0) {
        return 0;
    }
    return java.lang.Double.parseDouble(text);
}