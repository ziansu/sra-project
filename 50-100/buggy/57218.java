private double PPMMinusMeanTimesDDFMinusMean(int ppmValue) {
    double result = 0;
    double meanPPM = meanPPM(ppmValue);
    double meanDDF = meanDDF();
    for (ricocalculator.Line line : lines) {
        if ((line.getPpmValues()[ppmValue]) != 0) {
            double difference1 = (line.getPpmValues()[ppmValue]) - meanPPM;
            double difference2 = (line.getDateDiffDexA()) - meanDDF;
            result += difference1 * difference2;
        }
    }
    return result;
}