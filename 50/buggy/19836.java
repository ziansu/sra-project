public static boolean isLeftAssociative(char op) {
    switch (op) {
        case '(' :
        case '~' :
        case '*' :
        case '/' :
        case '%' :
        case '+' :
        case '-' :
            return true;
        default :
            return false;
    }
}