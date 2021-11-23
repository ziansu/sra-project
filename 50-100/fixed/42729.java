public void removeSeries(org.eclipse.ice.viz.service.ISeries series) {
    org.eclipse.ice.client.common.ActionTree tree = seriesMap.remove(series);
    if (tree != null) {
        double plotTime = 0.0;
        removeSeriesTree.remove(tree);
        plotProvider.removeSeries(plotTime, series);
        editor.removeSeries(series);
        seriesMap.remove(series);
    }
    return ;
}