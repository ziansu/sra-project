public static final boolean isOperator(char ch) {
    if (((((((ch == '+') || (ch == '-')) || (ch == '*')) || (ch == '/')) || (ch == '(')) || (ch == '%')) || (ch == '!')) {
        return true;
    }
    return false;
}