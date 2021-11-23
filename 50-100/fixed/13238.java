private void selectAndPerformReaction(double r2) {
    double threshold = (getTotalPropensity()) * r2;
    double totalRunningPropensity = getTopmodel().getPropensity();
    if (totalRunningPropensity >= threshold) {
        performReaction(getTopmodel(), threshold);
    }else {
    }
}