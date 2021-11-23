private void getOperator(char operator) {
    while (!(charStack.isEmpty())) {
        char previousOperator = charStack.pop();
        int currentPriority = getPriority(operator);
        int previousPriority = getPriority(previousOperator);
        if (previousOperator != '(') {
            if (currentPriority > previousPriority) {
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