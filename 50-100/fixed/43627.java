public void log(java.lang.Object model) {
    if ((model instanceof org.logbuddy.model.Returned) || (model instanceof org.logbuddy.model.Thrown)) {
        numberOfInvocations.set(((numberOfInvocations.get()) - 1));
    }
    logger.log(org.logbuddy.model.Depth.depth(numberOfInvocations.get(), model));
    if (model instanceof org.logbuddy.model.Invocation) {
        numberOfInvocations.set(((numberOfInvocations.get()) + 1));
    }
}