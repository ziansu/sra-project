private void calculateResult() {
    switch (operator) {
        case "+" :
            result = (leftValue) + (rightValue);
            break;
        case "-" :
            break;
        case "*" :
            break;
        case "/" :
            break;
    }
    java.lang.String resultString = java.lang.Double.toString(result);
    ioResultTextView.setText(resultString);
}