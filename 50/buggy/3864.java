public boolean findSystemOutliers(double benchmark, double threshold, java.lang.StringBuilder messages) {
    return margins.checkSystemOutliers(benchmark, threshold, messages);
}