private void setLeftChartContent(int selectedItemIndex) {
    org.jfree.data.xy.XYDataset dataset = de.hs.mannheim.modUro.controller.diagram.SimulationDiagramController.createDataset(simulationDiagram.getSimulationName(), simulationDiagram.getMetricTypes().get(selectedItemIndex).getMetricData());
    org.jfree.chart.JFreeChart chart = createChart(dataset, simulationDiagram.getMetricTypes().get(selectedItemIndex).getName());
    de.hs.mannheim.modUro.controller.diagram.fx.ChartViewer viewer = new de.hs.mannheim.modUro.controller.diagram.fx.ChartViewer(chart);
    leftPane.setCenter(viewer);
    leftPane.layout();
}