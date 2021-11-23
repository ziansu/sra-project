public double compare(double modelMaxMatchScore, double modelBestAvgScore) {
    if (modelMaxMatchScore != 0) {
        double combinedScore = 50 * ((modelMaxMatchScore / (theoreticalMaxMatchScore)) + (modelBestAvgScore / (theoreticalBestAvgScore)));
        if (combinedScore > 100) {
            combinedScore = 100;
        }
        return combinedScore / 100;
    }
    return 0;
}