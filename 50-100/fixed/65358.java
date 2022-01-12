public long advanceWindowGetNextEdge() {
    cn.fudan.domain.Edge curEdge;
    long curTime = cn.fudan.domain.SliceManager.H.peek().getCurrentTime();
    while (curTime == (cn.fudan.domain.SliceManager.H.peek().getCurrentTime())) {
        curEdge = cn.fudan.domain.SliceManager.H.remove();
        if (curEdge.isLast()) {
            addEdges(curEdge.getCurrentTime(), curEdge.getPairedWindows());
        }
    } 
    return curTime;
}