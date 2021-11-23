private void initializeMiniSAT() {
    unitClauses = new org.logicng.collections.LNGIntVector();
    this.orderHeap = new org.logicng.solvers.datastructures.FixedList();
    this.graphDrawer = new org.logicng.solvers.visualization.LEMTBDDGraphDrawer(idx2name, vars);
    this.learntsizeAdjustConfl = 0;
    this.learntsizeAdjustCnt = 0;
    this.learntsizeAdjustStartConfl = 100;
    this.learntsizeAdjustInc = 1.5;
    this.maxLearnts = 0;
}