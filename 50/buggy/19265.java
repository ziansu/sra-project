@java.lang.Override
public long timedExecution() throws java.io.IOException {
    if (!(initialized))
        throw new java.lang.NullPointerException("Generator has not been initialized yet. Call timedInit() before this method.");
    
    op.setStopCriterion(stops.apply(op.getTGG()));
    return timedExecution();
}