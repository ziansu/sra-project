private double calculateOverallQualityMeasure(java.lang.Integer numsentence) {
    double qualityMeasure = 1 - (((numDefectiveSentences.doubleValue()) / (numsentence.doubleValue())) * 100);
    return qualityMeasure;
}