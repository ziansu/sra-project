public java.util.TreeSet<hudson.model.IViewEntry> getFailingJobs() {
    computePassingAndFailingJobs();
    if (!(failing.isEmpty())) {
        return failing;
    }
    return unstable;
}