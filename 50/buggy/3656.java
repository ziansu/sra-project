public net.coderodde.simulation.lunch.Population withLunchTimeStandardDeviation(double lunchTimeStandardDeviation) {
    net.coderodde.simulation.lunch.Utils.checkStandardDeviation(lunchTimeStandardDeviation);
    return new net.coderodde.simulation.lunch.RandomPopulationGenerator(configuration.random, configuration.distribution, configuration.meanLunchTime, configuration.standardDeviationOfLunchTime).generate();
}