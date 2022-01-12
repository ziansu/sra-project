private void addEdges(long startTime, cn.fudan.domain.PairedWindow pairedWindows) {
    if ((pairedWindows.getLeftSize()) != 0)
        cn.fudan.domain.SliceManager.H.add(new cn.fudan.domain.Edge((startTime + (pairedWindows.getLeftSize())), pairedWindows, false));
    
    cn.fudan.domain.SliceManager.H.add(new cn.fudan.domain.Edge(((startTime + (pairedWindows.getLeftSize())) + (pairedWindows.getRightSize())), pairedWindows, true));
}