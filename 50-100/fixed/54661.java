public java.util.TreeSet<hudson.model.IViewEntry> getPassingJobs() {
    computePassingAndFailingJobs();
    if (!(failing.isEmpty())) {
        java.util.TreeSet<hudson.model.IViewEntry> aggregate = new java.util.TreeSet<hudson.model.IViewEntry>(new hudson.model.EntryComparator());
        aggregate.addAll(unstable);
        aggregate.addAll(completelyPassing);
        return aggregate;
    }
    return completelyPassing;
}