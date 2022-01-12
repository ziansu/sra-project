public static double findLinkerCutoff(java.util.Set<org.cytoscape.model.CyNode> upstreamnodeheatSet, java.util.Set<org.cytoscape.model.CyNode> downstreamnodeSet, java.util.Map upnodeScoreMapDiffused, java.util.Map downnodeScoreMapDiffused, double sizeFactor) {
    double linker_cutoff;
    if (downnodeScoreMapDiffused == null) {
        linker_cutoff = org.cytoscape.tiedie.internal.logic.TieDieUtil.findLinkerCutoffSingle(upstreamnodeheatSet, upnodeScoreMapDiffused, sizeFactor);
    }else {
        linker_cutoff = org.cytoscape.tiedie.internal.logic.TieDieUtil.findLinkerCutoffMulti(upstreamnodeheatSet, downstreamnodeSet, upnodeScoreMapDiffused, downnodeScoreMapDiffused, sizeFactor);
    }
    return linker_cutoff;
}