public Result run() {
    checkColor(dataList);
    checkType(dataList);
    checkNumbers(dataList);
    checkRow(dataList);
    checkRange(dataList, ranges);
    return result;
}