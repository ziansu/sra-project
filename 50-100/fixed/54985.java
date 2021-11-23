int getPriority(java.lang.Character operator) throws ru.mipt.java2016.homework.base.task1.ParsingException {
    if ((operator == '(') || (operator == ')'))
        return 0;
    
    if ((operator == '+') || (operator == '-'))
        return 1;
    
    if ((operator == '*') || (operator == '/'))
        return 2;
    
    if (operator == '±')
        return 3;
    
    throw new ru.mipt.java2016.homework.base.task1.ParsingException("Invalid symbol");
}