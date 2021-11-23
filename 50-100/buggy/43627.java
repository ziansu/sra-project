public void log(java.lang.Object model) {
    if ((model instanceof org.logbuddy.model.Returned) || (model instanceof org.logbuddy.model.Thrown)) {
        (numberOfInvocations)--;
    }
    logger.log(org.logbuddy.model.Depth.depth(numberOfInvocations, model));
    if (model instanceof org.logbuddy.model.Invocation) {
        (numberOfInvocations)++;
    }
}