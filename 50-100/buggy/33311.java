private void findCycles(ch.petikoch.libs.jtwfg.Graph<T> graph, java.util.Set<ch.petikoch.libs.jtwfg.DeadlockCycle<T>> cycleCollector) {
    java.util.Set<ch.petikoch.libs.jtwfg.Task<T>> visitedTasks = new java.util.HashSet<>();
    for (ch.petikoch.libs.jtwfg.Task<T> startTask : graph.getTasks()) {
        ch.petikoch.libs.jtwfg.DeadlockDetector.findDeadlocksDepthFirst(startTask, startTask.getWaitsForTasks(), new java.util.LinkedList<ch.petikoch.libs.jtwfg.Task<T>>(), cycleCollector, visitedTasks);
    }
}