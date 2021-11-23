private static java.lang.String getA() {
    java.lang.String number;
    while ((java.lang.Character.isDigit(Main.numbers.charAt(sample.CalculationAction.end))) | ((Main.numbers.charAt(sample.CalculationAction.end)) == '.')) {
        sample.CalculationAction.end += 1;
        if ((sample.CalculationAction.end) >= (Main.numbers.length())) {
            break;
        }
    } 
    number = Main.numbers.substring(sample.CalculationAction.start, sample.CalculationAction.end);
    return number;
}