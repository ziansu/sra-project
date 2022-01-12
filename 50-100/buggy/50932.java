public graph.GraphColorVertex mutate(graph.GraphColorGraph graph, java.util.ArrayList<java.awt.Color> colors, graph.GraphColorVertex parent) {
    for (int i = 0; i < (colors.size()); i++) {
        if (!(isConflicted(parent, colors.get(i)))) {
            parent.setColor(colors.get(i));
            updateVisualizer();
        }
    }
    return parent;
}