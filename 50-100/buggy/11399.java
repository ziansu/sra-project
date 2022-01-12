void add(double confidence, boolean correct) {
    for (int i = 0; i < (org.deidentifier.arx.aggregates.StatisticsClassification.CONFIDENCE_THRESHOLDS.length); i++) {
        if (confidence >= (org.deidentifier.arx.aggregates.StatisticsClassification.CONFIDENCE_THRESHOLDS[i])) {
            (falsePositive[i])++;
            truePositive[i] += (correct) ? 1.0 : 0.0;
        }
    }
}