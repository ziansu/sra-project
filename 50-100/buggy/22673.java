public int getOperationRowNum(java.lang.String opration, int startRow, int endRow, java.util.List<java.util.List<java.lang.String>> data) {
    int oprationRowNum = 0;
    for (int x = startRow; x <= endRow; x++) {
        if (data.get(x).get(4).equalsIgnoreCase(opration)) {
            return oprationRowNum = x;
        }
    }
    return oprationRowNum;
}