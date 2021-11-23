public void reset() {
    if (isTerminated()) {
        kernelsToRun.addAll(finishedKernels);
        finishedKernels.clear();
    }
    (iteration)++;
    end = -1;
    terminated = (kernelsToRun.isEmpty()) && (runningThreads.isEmpty());
}