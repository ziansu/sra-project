private int calcActorLFTLO(fr.tpt.s3.ls_mxc.model.Actor a, int deadline) {
    int ret = java.lang.Integer.MAX_VALUE;
    if (a.isSink()) {
        ret = deadline;
    }else {
        int test = java.lang.Integer.MAX_VALUE;
        for (fr.tpt.s3.ls_mxc.model.Edge e : a.getSndEdges()) {
            test = (e.getDest().getLFTLO()) - (e.getDest().getCLO());
            if (test < ret)
                ret = test;
            
        }
    }
    a.setLFTLO(ret);
    return ret;
}