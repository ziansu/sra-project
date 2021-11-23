public boolean contains(nl.pluizer.pathfinder.Node node) {
    nl.pluizer.pathfinder.Candidate candidate = findCandidate(node, closedList);
    return (candidate != null) && (closedList.contains(node));
}