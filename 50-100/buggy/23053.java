private boolean vertexLabelFilter(br.uff.ic.utility.graph.Vertex vertex) {
    java.util.List filtersL = GraphFrame.vertexFilterList.getSelectedValuesList();
    for (java.lang.Object filtersL1 : filtersL) {
        java.lang.String filter = ((java.lang.String) (filtersL1));
        if (filter.equalsIgnoreCase("All Vertices")) {
            return false;
        }
        if (vertex.getLabel().contains(filter)) {
            return false;
        }
    }
    return true;
}