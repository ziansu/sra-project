private void compute() throws java.lang.Exception {
    weka.core.Instances dataa = weka.core.converters.ConverterUtils.DataSource.read(filePath);
    weka.clusterers.DBSCAN DBS;
    DBS = new weka.clusterers.DBSCAN();
    weka.clusterers.ClusterEvaluation eval = new weka.clusterers.ClusterEvaluation();
    DBS.buildClusterer(dataa);
    eval.setClusterer(DBS);
    eval.evaluateClusterer(dataa);
    double[] p = eval.getClusterAssignments();
    new gui.AttributeSelection_Stats(dataa, eval, "DBS SCAN", p);
}