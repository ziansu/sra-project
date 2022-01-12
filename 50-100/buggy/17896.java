private int getSbOperatorRowNumber(java.util.List<java.util.List<java.lang.String>> exceldata, int apiRowNumber, int appDetailsEndRow, java.lang.String operator) {
    int operatorNumber = 0;
    for (int x = apiRowNumber; x <= appDetailsEndRow; x++) {
        if (exceldata.get(x).get(4).trim().equalsIgnoreCase(operator)) {
            return operatorNumber = x;
        }
    }
    return operatorNumber;
}