private boolean hasPriority(char op1, char op2) {
    if ((op2 == '(') || (op2 == ')'))
        return false;
    
    if (((op1 == '*') || (op1 == '/')) && ((op2 == '+') || (op2 == '-')))
        return false;
    
    return true;
}