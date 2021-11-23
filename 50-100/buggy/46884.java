public void setInput(edu.rice.cs.hpc.viewer.window.Database db, edu.rice.cs.hpc.data.experiment.scope.RootScope scope, java.util.List<java.lang.Integer> threads) {
    database = db;
    myRootScope = scope;
    objViewActions.setTreeViewer(treeViewer);
    ((edu.rice.cs.hpc.viewer.scope.thread.ThreadScopeViewAction) (objViewActions)).setMetricManager(getMetricManager());
    edu.rice.cs.hpc.data.experiment.Experiment experiment = db.getExperiment();
    edu.rice.cs.hpc.data.experiment.metric.BaseMetric[] metrics = experiment.getMetricRaw();
    initTableColumns(threads, metrics);
    updateDisplay();
}