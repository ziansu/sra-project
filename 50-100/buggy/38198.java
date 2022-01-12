public void accumulate(integratedtoolkit.types.Profile profile) {
    minTime = java.lang.Math.min(minTime, profile.minTime);
    averageTime = ((profile.averageTime) + ((executions) * (averageTime))) / ((executions) + 1);
    maxTime = java.lang.Math.max(maxTime, profile.maxTime);
    executions += profile.executions;
}