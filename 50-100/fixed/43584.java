@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    seriesProvider.setDataMax(java.lang.Double.parseDouble(maxText.getText()));
    seriesProvider.setDataMin(java.lang.Double.parseDouble(minText.getText()));
    intensityGraph.setMax(seriesProvider.getDataMax());
    intensityGraph.setMin(seriesProvider.getDataMin());
    lws.setContents(intensityGraph);
    return ;
}