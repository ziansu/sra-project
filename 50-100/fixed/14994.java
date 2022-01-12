protected int countNewTownIndex(double[] probabilityDistribution, double happenedProbability) {
    int newTownIndex = 0;
    double probSum = 0;
    for (int j = 0; j < (probabilityDistribution.length); j++) {
        probSum += probabilityDistribution[j];
        if (happenedProbability < probSum) {
            newTownIndex = (j - (probabilityDistribution.length)) + (numberOfTowns);
            java.lang.System.out.println(newTownIndex);
            break;
        }
    }
    return newTownIndex;
}