@java.lang.Override
public void tick(net.xqhs.graphs.context.Instant.TimeKeeper ticker, net.xqhs.graphs.context.Instant now) {
    java.util.Set<net.xqhs.graphs.graph.Edge> removals = new java.util.HashSet<net.xqhs.graphs.graph.Edge>();
    while (validityQueue.peek().getKey().before(now)) {
        removals.add(validityQueue.poll().getValue());
    } 
    removeAll(removals);
}