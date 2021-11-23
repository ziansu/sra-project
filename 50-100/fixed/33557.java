private int getOperatorStartRow(int startRow, int endRow, java.lang.String operator, java.lang.String operation, java.util.List<java.util.List<java.lang.String>> afterExcel) {
    int start = 0;
    for (int x = startRow; x <= endRow; x++) {
        if ((afterExcel.get(x).get(4).equalsIgnoreCase(operator)) && (afterExcel.get(x).get(5).equalsIgnoreCase(operation))) {
            start = x;
            break;
        }
    }
    return start;
}