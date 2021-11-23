public static com.sensia.swetools.editors.sensorml.client.panels.charts.ISensorChart createChart(com.sensia.swetools.editors.sensorml.client.panels.widgets.AbstractSensorElementWidget root, java.lang.String values, java.lang.String tokenSeparator, java.lang.String blockSeparator) {
    java.util.List<com.sensia.swetools.editors.sensorml.client.panels.widgets.ISensorWidget> fields = com.sensia.swetools.editors.sensorml.client.panels.widgets.AbstractSensorElementWidget.findWidgets(root, "field", TAG_DEF.SWE, TAG_TYPE.ELEMENT);
    com.sensia.swetools.editors.sensorml.client.panels.charts.ISensorChart chart = null;
    if ((fields.size()) == 2) {
        chart = com.sensia.swetools.editors.sensorml.client.panels.charts.versusline.SWESensorDataArrayVersusLineHelper.create1LineVersusChart(root, fields.get(0), fields.get(1), values, tokenSeparator, blockSeparator);
    }
    return chart;
}