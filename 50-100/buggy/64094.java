private org.upb.fmde.de.categories.concrete.graphs.Graph createHostGraph() {
    org.upb.fmde.de.categories.concrete.finsets.FinSet edges = new org.upb.fmde.de.categories.concrete.finsets.FinSet("Host Graph Edges");
    org.upb.fmde.de.categories.concrete.finsets.FinSet vertices = new org.upb.fmde.de.categories.concrete.finsets.FinSet("Host Graph Vertices", java.util.Arrays.asList("B"));
    org.upb.fmde.de.categories.concrete.finsets.TotalFunction src = new org.upb.fmde.de.categories.concrete.finsets.TotalFunction(edges, "src arrow", vertices);
    org.upb.fmde.de.categories.concrete.finsets.TotalFunction target = new org.upb.fmde.de.categories.concrete.finsets.TotalFunction(edges, "trg arrow", vertices);
    org.upb.fmde.de.categories.concrete.graphs.Graph g = new org.upb.fmde.de.categories.concrete.graphs.Graph("Host Graph", edges, vertices, src, target);
    return g;
}