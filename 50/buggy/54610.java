public void plot(gtna.graph.Graph g, java.lang.String filename) {
    if (!(disabled)) {
        gephi.Plot(g, ((filename + ".") + (extension)));
    }
}