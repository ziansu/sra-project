private boolean hasPriority(char op1, char op2) {
    if ((op2 == '(') || (op2 == ')'))
        return false;
    
    if (((op2 == '*') || (op2 == '/')) && ((op1 == '+') || (op1 == '-')))
        return false;
    
    return true;
}