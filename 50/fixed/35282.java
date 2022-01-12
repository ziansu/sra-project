public net.coderodde.simulation.lunch.Cashier withStandardDeviationOfServiceTime(double standardDeviationOfServiceTime) {
    net.coderodde.simulation.lunch.Utils.checkStandardDeviation(standardDeviationOfServiceTime);
    return new net.coderodde.simulation.lunch.Cashier(configuration.meanServiceTime, standardDeviationOfServiceTime, configuration.random);
}