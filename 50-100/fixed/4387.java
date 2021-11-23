public static double graphStructuralSimilarity(gr.demokritos.iit.jinsect.structs.UniqueJVertexGraph gA, gr.demokritos.iit.jinsect.structs.UniqueJVertexGraph gB) {
    double total = 0;
    for (gr.demokritos.iit.jinsect.structs.Edge e : gA.edgeSet()) {
        gr.demokritos.iit.jinsect.structs.JVertex vFrom = gA.getEdgeSource(e);
        gr.demokritos.iit.jinsect.structs.JVertex vTo = gA.getEdgeTarget(e);
        total += gr.demokritos.iit.jinsect.jutils.edgeStructuralSimilarity(gA, gB, vFrom, vTo);
    }
    return total;
}