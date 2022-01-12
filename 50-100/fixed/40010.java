public double calculatePrecisionOfData() {
    dgh.AttributeAnonymityLevel max = dgh.AttributeAnonymityLevel.getMaxLevels(types, classes);
    double sum = 0.0;
    for (java.lang.String s : levelOfAnonymization.keySet()) {
        sum += ((double) (levelOfAnonymization.get(s))) / ((double) (max.get(s)));
    }
    sum = sum / ((double) (levelOfAnonymization.keySet().size()));
    return 1.0 - sum;
}