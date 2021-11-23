@java.lang.Override
public java.util.ArrayList<dna.labels.Label> computeLabels(dna.graph.Graph g, dna.updates.batch.Batch batch, dna.series.data.BatchData batchData, dna.metrics.IMetric[] metrics) {
    java.util.ArrayList<dna.labels.Label> list = new java.util.ArrayList<dna.labels.Label>();
    if ((model) != null) {
        java.lang.String prediction = model.predict(batchData);
        list.add(new dna.labels.Label(this.getName(), "class", prediction));
    }
    return list;
}