public java.lang.String loadGraph(java.lang.String tree) {
    int num = java.lang.Integer.parseInt(tree.substring(1));
    return weka.gui.explorer.RVineVisualization.buildJsonObject(gs[num]).toString();
}