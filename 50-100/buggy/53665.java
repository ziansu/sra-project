public boolean isParallel(edu.kit.joana.ifc.sdg.graph.SDGNode m, int mThread, int region) {
    edu.kit.joana.ifc.sdg.graph.slicer.graph.threads.ThreadRegion mRegion = regions.getThreadRegion(m, mThread);
    if ((mThread == (mRegion.getThread())) && (!(isDynamic(mThread)))) {
        return false;
    }else {
        return map.get(mRegion.getID(), region);
    }
}