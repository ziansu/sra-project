public void switchToSnap(long number) {
    if (((this.currentSnap) == ((this.getMaxSnapNumber()) - 1)) && (loop))
        number = 1;
    
    numberQueue.offer(number);
    boolean res = graph.loadGraph(number);
    if (!res)
        this.viewer.disableAutoLayout();
    
    setSnapNumber(number);
    notifyJump(number);
    updateCharts(number);
    notifyDraw();
    this.currentSnap = number;
}