public void accumulate(integratedtoolkit.types.Profile profile) {
    minTime = java.lang.Math.min(minTime, profile.minTime);
    averageTime = (((profile.executions) * (profile.averageTime)) + ((executions) * (averageTime))) / ((executions) + (profile.executions));
    maxTime = java.lang.Math.max(maxTime, profile.maxTime);
    executions += profile.executions;
}