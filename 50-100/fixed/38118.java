private int prOfOp(Data d) {
    int pr = 0;
    char elem = ((char) (d.getValue()));
    switch (elem) {
        case '+' :
        case '-' :
            pr = 0;
            break;
        case '*' :
        case '/' :
        case '%' :
            pr = 2;
            break;
        case '^' :
            pr = 3;
            break;
        case '(' :
        case ')' :
            pr = -1;
            break;
        default :
            pr = -2;
    }
    return pr;
}