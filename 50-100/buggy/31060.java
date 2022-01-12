public static <V extends org.gradoop.model.api.EPGMVertex, E extends org.gradoop.model.api.EPGMEdge, G extends org.gradoop.model.api.EPGMGraphHead> org.gradoop.util.AsciiGraphLoader<G, V, E> fromFile(java.lang.String fileName, org.gradoop.util.GradoopConfig<G, V, E> config) throws java.io.IOException {
    java.lang.System.out.println("*** loading from file ***");
    java.lang.System.out.println(fileName);
    return new org.gradoop.util.AsciiGraphLoader(new org.s1ck.gdl.GDLHandler.Builder().setDefaultGraphLabel(GConstants.DEFAULT_GRAPH_LABEL).setDefaultVertexLabel(GConstants.DEFAULT_VERTEX_LABEL).setDefaultEdgeLabel(GConstants.DEFAULT_EDGE_LABEL).buildFromFile(fileName), config);
}