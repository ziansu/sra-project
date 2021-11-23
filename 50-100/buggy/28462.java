@java.lang.Override
protected void initGraph() {
    source = new org.bham.aucom.fts.source.TimeSeriesSource<org.bham.aucom.data.Observation>("trainerGraphSource");
    org.bham.aucom.fts.tranform.EncodeData encodeNode = new org.bham.aucom.fts.tranform.EncodeData();
    tdfNode = new org.bham.aucom.fts.tranform.GenerateTemporalDurationFeature();
    tdfNode.setGenerator(new org.bham.aucom.fts.tranform.TemporalDurationFeatureGenerator(new java.util.ArrayList<java.lang.Integer>()));
    sink = new org.bham.aucom.fts.sink.TimeSeriesSink<org.bham.aucom.data.TemporalDurationFeature>(new org.bham.aucom.data.timeseries.TemporalDurationFeatureTimeSeries());
    graph.connect(source, encodeNode);
    graph.connect(encodeNode, tdfNode);
    graph.connect(tdfNode, sink);
}