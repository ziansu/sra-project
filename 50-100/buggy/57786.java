private void addEdges(long startTime, cn.fudan.domain.PairedWindow pairedWindows) {
    cn.fudan.domain.SliceManager.H.add(new cn.fudan.domain.Edge((startTime + (pairedWindows.getLeftSize())), pairedWindows, false));
    cn.fudan.domain.SliceManager.H.add(new cn.fudan.domain.Edge(((startTime + (pairedWindows.getLeftSize())) + (pairedWindows.getRightSize())), pairedWindows, true));
}