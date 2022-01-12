@java.lang.Override
public java.util.Set<org.sosy_lab.cpachecker.cpa.smg.refiner.SMGMemoryPath> getTrackedMemoryPathsOnNode(org.sosy_lab.cpachecker.cfa.model.CFANode pLocationNode) {
    if (trackedMemoryPaths.containsKey(pLocationNode)) {
        return trackedMemoryPaths.get(pLocationNode);
    }else {
        return com.google.common.collect.ImmutableSet.of();
    }
}