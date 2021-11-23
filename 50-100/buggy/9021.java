public java.lang.String resolveIssue() {
    Ticket current = queue.removeMin();
    current.setSolution(solutions[current.getPriority()]);
    if ((current.resolved) == true) {
        java.lang.String q = (("Issue: " + current) + "\nSolution: ") + (current.getSolution());
    }
    return q;
}