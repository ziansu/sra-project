@org.jetbrains.annotations.NotNull
private <D extends org.jetbrains.kotlin.resolve.calls.CallableDescriptor, F extends D> org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResults<F> computeTasksFromCandidatesAndResolvedCall(@org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.calls.BasicCallResolutionContext context, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.calls.JetReferenceExpression referenceExpression, @org.jetbrains.annotations.NotNull
java.util.Collection<org.jetbrains.kotlin.resolve.calls.ResolutionCandidate<D>> candidates, @org.jetbrains.annotations.NotNull
org.jetbrains.kotlin.resolve.calls.CallTransformer<D, F> callTransformer) {
    org.jetbrains.kotlin.resolve.calls.TracingStrategy tracing = org.jetbrains.kotlin.resolve.calls.TracingStrategyImpl.create(referenceExpression, context.call);
    java.util.List<org.jetbrains.kotlin.resolve.calls.ResolutionTask<D, F>> prioritizedTasks = taskPrioritizer.<D, F>computePrioritizedTasksFromCandidates(context, candidates, tracing);
    return doResolveCallOrGetCachedResults(context, prioritizedTasks, callTransformer, tracing);
}