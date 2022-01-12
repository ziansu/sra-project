private int getSbOPerationRowNumber(java.util.List<java.util.List<java.lang.String>> exceldata, int operatorRowNumber, int appDetailsEndRow, java.lang.String operation) {
    int operationNumber = 0;
    for (int x = operatorRowNumber; x <= appDetailsEndRow; x++) {
        if (exceldata.get(x).get(5).trim().equalsIgnoreCase(operation)) {
            operationNumber = x;
            break;
        }
    }
    return operationNumber;
}