int getPriority(java.lang.Character operator) throws ru.mipt.java2016.homework.base.task1.ParsingException {
    if ((operator.equals('(')) || (operator.equals(')')))
        return 0;
    
    if ((operator.equals('+')) || (operator.equals('-')))
        return 1;
    
    if ((operator.equals('*')) || (operator.equals('/')))
        return 2;
    
    if (operator == '±')
        return 3;
    
    throw new ru.mipt.java2016.homework.base.task1.ParsingException("Invalid symbol");
}