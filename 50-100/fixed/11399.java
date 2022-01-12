void add(double confidence, boolean correct) {
    for (int i = 0; i < (org.deidentifier.arx.aggregates.StatisticsClassification.CONFIDENCE_THRESHOLDS.length); i++) {
        if (confidence >= (org.deidentifier.arx.aggregates.StatisticsClassification.CONFIDENCE_THRESHOLDS[i])) {
            falsePositive[i] += (correct) ? 0.0 : 1.0;
            truePositive[i] += (correct) ? 1.0 : 0.0;
        }
    }
}