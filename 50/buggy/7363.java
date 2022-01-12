private double calculateOverallQualityMeasure(java.lang.Integer numsentence) {
    double qm = (1 - ((numDefectiveSentences.doubleValue()) / (numsentence.doubleValue()))) * 100;
    double qualityMeasure = java.lang.Math.abs(qm);
    return qualityMeasure;
}