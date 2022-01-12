public il.ac.bgu.cs.bp.bpjs.diningphil.Node getNextNode(il.ac.bgu.cs.bp.bpjs.events.BEvent e) throws java.lang.Exception {
    return new il.ac.bgu.cs.bp.bpjs.diningphil.Node(bp, il.ac.bgu.cs.bp.bpjs.search.BProgramSyncSnapshotCloner.clone(systemState).triggerEvent(e), e);
}