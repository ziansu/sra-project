private double getMergeGQ(java.lang.Double oldGrpQuality, double confidence) {
    if ((oldGrpQuality.compareTo(0.0)) == 0) {
        return confidence;
    }
    return confidence > oldGrpQuality ? oldGrpQuality : confidence;
}