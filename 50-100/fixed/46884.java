public void setInput(edu.rice.cs.hpc.viewer.window.Database db, edu.rice.cs.hpc.data.experiment.scope.RootScope scope) {
    if (((database) != db) && ((myRootScope) != scope)) {
        database = db;
        myRootScope = scope;
        objViewActions.setTreeViewer(treeViewer);
        ((edu.rice.cs.hpc.viewer.scope.thread.ThreadScopeViewAction) (objViewActions)).setMetricManager(getMetricManager());
        updateDisplay();
    }
}