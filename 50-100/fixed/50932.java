public graph.GraphColorVertex mutate(graph.GraphColorVertex parent, java.util.ArrayList<java.awt.Color> colors) {
    for (int i = 0; i < (colors.size()); i++) {
        if (!(isConflicted(parent, colors.get(i)))) {
            parent.setColor(colors.get(i));
            updateVisualizer();
        }
    }
    return parent;
}