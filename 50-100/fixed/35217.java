private static java.math.BigDecimal calcProductDistances(java.util.List<java.math.BigDecimal> dimensionList) {
    java.math.BigDecimal returnValue = java.math.BigDecimal.ZERO;
    java.math.BigDecimal totalDistances = java.math.BigDecimal.ZERO;
    if ((dimensionList.size()) > 0) {
        for (java.math.BigDecimal dimension : dimensionList) {
            totalDistances = totalDistances.add(new java.math.BigDecimal(java.lang.Math.pow(dimension.doubleValue(), 2)));
        }
    }
    returnValue = new java.math.BigDecimal(java.lang.Math.sqrt(totalDistances.doubleValue()));
    return returnValue;
}