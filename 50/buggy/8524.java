public void RefreshGraph(br.uff.ic.provviewer.Variables variables) {
    CollapseEdges(variables);
    variables.ComputeEdgeTypeValues();
    variables.filter.RemoveFilters(variables);
    variables.view.repaint();
}