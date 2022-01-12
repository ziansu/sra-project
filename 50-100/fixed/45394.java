public static int add(java.lang.String text) {
    if (text.equals("")) {
        return 0;
    }else
        if (text.contains(",")) {
            return is.ru.stringcalculator.Calculator.sum(is.ru.stringcalculator.Calculator.splitNumbers(text));
        }else
            return 1;
        
    
}