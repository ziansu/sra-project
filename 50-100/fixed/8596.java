private int calculateCC(ast.graph.Graph graph) {
    int offset;
    offset = graph.getFinalNodes().size();
    offset = (offset == 1) ? offset - 1 : offset - 2;
    offset = 0;
    return ((graph.edgeCount()) - ((graph.size()) - offset)) + 2;
}