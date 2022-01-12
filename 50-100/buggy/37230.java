private void getOperator(char operator) {
    while (!(charStack.isEmpty())) {
        char previousOperator = charStack.peek();
        int currentPriority = getPriority(operator);
        int previousPriority = getPriority(previousOperator);
        if (previousOperator != '(') {
            if (previousPriority < currentPriority) {
                charStack.pop();
                charStack.push(previousOperator);
                break;
            }else {
                postfix += previousOperator;
            }
        }else {
            break;
        }
    } 
    charStack.push(operator);
}