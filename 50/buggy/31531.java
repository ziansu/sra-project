protected void replayGraph(org.graphstream.graph.Graph graph) {
    lock.lock();
    super.replayGraph(graph);
    lock.unlock();
}