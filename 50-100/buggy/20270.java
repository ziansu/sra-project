public edu.sjtu.benchmark.linkbench.util.LinkbenchOperation nextTransaction(edu.sjtu.benchmark.linkbench.LinkbenchClient.Transaction txn) {
    long nid = 0;
    switch (txn) {
        case GET_NODE :
            nid = linkWeights.nextValue();
            break;
        case GET_LINK :
            nid = linkWeights.nextValue();
        default :
            assert false : "should not come to this point";
    }
    return new edu.sjtu.benchmark.linkbench.util.LinkbenchOperation(((int) (nid)));
}