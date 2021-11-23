public java.lang.String calculateResult(java.lang.String operator) {
    switch (operator) {
        case "+" :
            result = (leftValue) + (rightValue);
            break;
        case "-" :
            break;
        case "*" :
            result = (leftValue) * (rightValue);
            break;
        case "/" :
            break;
    }
    java.lang.String resultString = java.lang.Double.toString(result);
    return resultString;
}