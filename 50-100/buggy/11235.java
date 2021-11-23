private com.alphatica.genotick.genotick.RobotData createDataUpToTimePoint(int i) {
    java.util.List<double[]> list = new java.util.ArrayList<>();
    for (double[] original : values) {
        double[] copy = copyReverseArray(original, i);
        list.add(copy);
    }
    try {
        java.lang.Double futureChange = calculateFutureChange(timePoints[i]);
        return com.alphatica.genotick.genotick.RobotData.createData(list, name, futureChange);
    } catch (com.alphatica.genotick.data.NoDataForTimePointException ex) {
        return com.alphatica.genotick.genotick.RobotData.createEmptyData(name);
    }
}