@java.lang.Override
public void run() {
    try {
        series.setEnabled(true);
        if (series instanceof org.eclipse.ice.viz.service.connections.ConnectionSeries) {
            selectedService.getPlot().setIndependentSeries(series);
        }
        selectedService.getPlot().draw(plotComposite);
        body.layout();
    } catch (java.lang.Exception e) {
        org.eclipse.ice.viz.service.PlotEditor.logger.error(((getClass().getName()) + "Exception! Error while drwaing plot."), e);
    }
}