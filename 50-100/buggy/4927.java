private java.lang.String getArithmeticFunctions(java.lang.String num2) {
    java.lang.System.out.println(("yes in here wtf: " + (num1)));
    if (addFunctionActive) {
        return add(num1, num2);
    }
    if (subFunctionActive) {
        return subtract(num1, num2);
    }
    if (multFunctionActive) {
        return multiply(num1, num2);
    }
    if (divFunctionActive) {
        return divide(num1, num2);
    }
    if (powerFunctionActive) {
        return power(num1, num2);
    }else
        return "0";
    
}