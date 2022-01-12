private int getOperatorPositionInString(java.lang.String[] operators, int operatorNumber) {
    int stringPosition = 0;
    for (int i = 0; i < operatorNumber; i++)
        stringPosition += (operators[i].length()) + 1;
    
    return stringPosition;
}