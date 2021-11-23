private void setRightChartContent(java.lang.String selectedItem) {
    org.jfree.data.xy.XYDataset dataset = de.hs.mannheim.modUro.controller.diagram.ModeltypeDiagramController.createDataset(modeltypeDiagram.getSimulationList(), selectedItem);
    org.jfree.chart.JFreeChart chart = createChart(dataset, selectedItem);
    chart.removeLegend();
    de.hs.mannheim.modUro.controller.diagram.fx.ChartViewer viewer = new de.hs.mannheim.modUro.controller.diagram.fx.ChartViewer(chart);
    rightPane.setCenter(viewer);
    rightPane.layout();
}