private java.util.Collection<com.ilscipio.scipio.setup.SetupWorker.StepState> getStepStatesInternal(boolean lazyResolve) {
    java.util.Map<java.lang.String, com.ilscipio.scipio.setup.SetupWorker.StepState> stepStateMap = getStepStateMapLoaded(lazyResolve);
    java.util.List<com.ilscipio.scipio.setup.SetupWorker.StepState> values = new java.util.ArrayList<>();
    for (java.lang.String step : getSteps()) {
        values.add(stepStateMap.get(step));
    }
    return values;
}