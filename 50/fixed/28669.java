@java.lang.Override
public boolean hasEdge(int from, int to) {
    super.validateEdge(from, to);
    return neighbourList.get(from).contains(to);
}