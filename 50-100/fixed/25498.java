public synchronized boolean finishedApplication() {
    appspecs.Decider decider = applicationSpecification.getDecider();
    java.util.Map<java.lang.String, interfaces.ApplicationAggregator<? extends java.io.Serializable, ? extends java.io.Serializable>> aggregators = applicationSpecification.getAggregators();
    if (decider == null) {
        return true;
    }
    decider.decideFollowingIteration(aggregators);
    return !(decider.requiresRunning());
}