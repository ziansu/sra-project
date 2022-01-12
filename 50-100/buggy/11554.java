public void factorial() {
    java.lang.Double num1 = ((java.math.BigDecimal) (numbers.pop())).doubleValue();
    java.lang.System.out.println(num1);
    num1 = CalcModel.fact(num1);
    java.lang.System.out.println(num1);
    addToExpressionList("!");
    updateRounding(num1.toString());
    java.math.BigDecimal b = java.math.BigDecimal.valueOf(num1).round(roundingAmount);
    numbers.push(b);
    calculatedValues.push(b);
}