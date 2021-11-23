private double getMapNormalizeValue(java.util.Map<java.lang.Integer, processing.analyzing.ReuseProbValue> map) {
    double sum = 0.0;
    for (java.util.Map.Entry<java.lang.Integer, processing.analyzing.ReuseProbValue> entry : map.entrySet()) {
        if ((entry.getValue().getSum()) > sum) {
            if ((entry.getValue().getSum()) > sum) {
                sum = entry.getValue().getSum();
            }
        }
    }
    return sum;
}