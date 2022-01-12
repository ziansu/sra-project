public java.lang.String resolveIssue() {
    Ticket current = ((Ticket) (queue.removeMin()));
    current.setSolution(solutions[current.getPriority()]);
    java.lang.String q = (("Issue: " + current) + "\nSolution: ") + (current.getSolution());
    return q;
}