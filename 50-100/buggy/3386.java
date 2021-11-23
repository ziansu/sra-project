void createGraph(java.lang.String graphName) {
    graph = new org.graphstream.graph.implementations.MultiGraph(graphName);
    graph.addAttribute("ui.stylesheet", styleSheet);
    graph.setStrict(false);
    graph.setAutoCreate(true);
    graph.addAttribute("ui.quality");
    graph.addAttribute("ui.antialias");
    viewer = new org.graphstream.ui.view.Viewer(graph, Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
    view = viewer.addDefaultView(false);
    viewer.setCloseFramePolicy(Viewer.CloseFramePolicy.CLOSE_VIEWER);
}